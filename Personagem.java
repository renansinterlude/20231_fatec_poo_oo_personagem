import static java.lang.Math.min;
public class Personagem {
    // variável de instância
    String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;

    //construtor padrao: lista de parametros vazia
    Personagem (int energia, int fome, int sono) {
        //shadowing. passa variaveis do parametro na frente da outra
        if(energia >= 10 && energia <= 10)
            this.energia = energia;

        if(fome >= 0 && fome <= 10)
            this.fome = fome;
        
        if (sono >= 0 && sono <=10)
            this.sono = sono;
        
        this.energia = energia;
        this.fome = fome;
        this.sono = sono;
        System.out.println("Construindo um objeto...");
    }

    //println == print line
    // isso é um método
    void cacar() {
        if (energia >= 2) {
           System.out.println(nome + " cacando"); 
           energia = energia - 2;
           // energia -= 2
        }
        else {
            System.out.println(nome + " sem energia para cacar.");
        }
        fome = min(fome + 1, 10); //-> minimo, incremento, maximo.
        // fome = Math.min se o pacote Math nao tivesse sido importado.
        sono = min(sono + 1, 10);
        System.out.println(obterEstado());
    } 


    void comer() {
        if (fome >= 1) { // garante que a fome só seja descrescida se ele TIVER fome.
            System.out.print(nome + " comendo\n"); 
            energia = min(energia + 1, 10);
            fome -= 1; // fome = fome -1 ou fome --; 
        }
        else {
            System.out.println(nome + " sem fome");
        }
        System.out.println(obterEstado());
    }

    void dormir() {
        if (sono >= 1) {
            System.out.printf("%s dormindo%n", nome);
            energia = energia + 1 < 10 ? energia + 1 : 10; // operador ternario
            // energia + 1 é menor que 10? se sim, energia +1, se nao energia = 10
            sono--;
        }
        else {
            System.out.println(nome + " sem sono");
        }
        System.out.println(obterEstado());
    }

    String obterEstado(){
        return String.format("e(%d), s(%d), f(%d)", energia, sono, fome);
    }
}