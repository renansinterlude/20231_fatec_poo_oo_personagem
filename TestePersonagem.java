public class TestePersonagem {
    public static void main (String [] args) {
        //p é uma variavel de referencia. Ela faz referencia ao objeto construido com new
        // Personagem p = new Personagem ();
        // java 10+ (inferencia de tipo)
        // var = cria uma variavel de referencia. 
        var p = new Personagem();
        p.nome = "John"; // p. -> operador de acesso a membro (de Personagem)
        p.cacar();
        p.comer();
        p.dormir();

    }
}
