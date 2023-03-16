public class TestePersonagem {
    public static void main (String [] args) throws Exception {

        //p é uma variavel de referencia. Ela faz referencia ao objeto construido com new
        // Personagem p = new Personagem ();
        // java 10+ (inferencia de tipo)
        // var = cria uma variavel de referencia. 
        var p = new Personagem(2, 4, 10); // chamada de construtor
        var p2 = new Personagem(8, 10, 2);
        var p3 = new Personagem ("John", 10, 10, 10);
        p.nome = "John"; // p. -> operador de acesso a membro (de Personagem)
        // 10, 0, 0, John -> Estado: valores que existem no instante da execução.
        while (true) {
        p.cacar();
        Thread.sleep(5000);
        p.comer();
        Thread.sleep(5000);
        p.dormir();
        Thread.sleep(5000);
        p.cacar();
        Thread.sleep(5000);
        p.cacar();
        Thread.sleep(5000);
        p.cacar();
        System.out.println("=======================================");
        Thread.sleep(10000);
        }
    }

}

/*int idade = 18;

        if (idade >= 18) {
            System.out.println("Pode dirigir");
        }
        else {
            System.out.println("Não pode dirigir");
        }

        System.out.println(idade >= 18 ? "Sim" : "Nao"); // operador ternario */