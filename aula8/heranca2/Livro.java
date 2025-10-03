package aula8.heranca2;

public class Livro extends Material {

    int numeroPaginas;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, int numeroPagina){
        super(titulo, autor, anoPublicacao);
        this.numeroPaginas =numeroPagina;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Numero de páginas; " + this.numeroPaginas);
    }


    
}
