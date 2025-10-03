package aula8.heranca2;

public class Main {
    
    public static void main(String args[]){

        Livro livro = new Livro("O Senhor dos Anéis", 
        "J.R.R. Tolkien", 1954, 1170);

        Revista revista = new Revista("National Geographic", 
        "Diversos", 2025, 12);

        DVD dvd = new DVD("O Poderoso Chefão", 
        "Francis Ford Coppola", 1972, 175);

        livro.exibirDetalhes();
        System.out.println("=".repeat(50));
        revista.exibirDetalhes();
        System.out.println("=".repeat(50));
        dvd.exibirDetalhes();

    }
}
