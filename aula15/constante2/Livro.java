package aula15.constante2;

public final class Livro {

    private final String titulo;
    private final int anoPublicacao;

    public Livro(String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public int getAnoPublicacao(){
        return this.anoPublicacao;
    }

    public void exibirInformacoes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Ano de Publicação: " + this.anoPublicacao);
    }
    
}
