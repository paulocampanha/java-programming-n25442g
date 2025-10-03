package aula8.heranca2;

public class Revista extends Material {
    
    int numeroEdicao;

    //Construtor
    public Revista(String titulo, String autor, int anoPublicacao, int numeroEdicao){
        super(titulo, autor, anoPublicacao);
        this.numeroEdicao = numeroEdicao;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Número da Edição: " + this.numeroEdicao);
    }

}
