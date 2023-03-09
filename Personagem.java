import static java.lang.Math.min;
public class Personagem {
    // variável de instância
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

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
    }
}