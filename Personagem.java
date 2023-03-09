public class Personagem {
    // variável de instância
    String nome;
    int energia;
    int fome;
    int sono;

    //println == print line
    // isso é um método
    void cacar() {
        System.out.println(nome + " cacando");
    } 

    void comer() {
        System.out.print(nome + " comendo\n");
    }

    void dormir() {
        System.out.printf("%s dormindo%n", nome);
    }
}