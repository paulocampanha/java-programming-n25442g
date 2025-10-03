package aula15.constante2;

public class Main {
    
    public static void main(String args[]){

        Livro l1 = new Livro("O Mistério do Castelo", 
        1995);

        System.out.println("Titulo do livro" + l1.getTitulo());

        l1.exibirInformacoes();

        Livro l2 = new Livro("O senhor d0os anéis", 1990);

    }
}
