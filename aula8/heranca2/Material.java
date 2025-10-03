package aula8.heranca2;

public class Material {
    
    String titulo;
    String autor;
    int anoPublicacao;
    

    // Construtor
    public Material(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
    }

    public void emprestar(){
        System.out.println("Material Emprestado");
            
    }

    public void devolvido(){
        System.out.println("Material Devolvido");
    }
}
