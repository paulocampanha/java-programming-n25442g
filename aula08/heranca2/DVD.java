package aula8.heranca2;

public class DVD extends Material {

    int duracao;

    public DVD(String titulo, String autor, int anoPublicacao, int duracao){
        super(titulo, autor, anoPublicacao);
        this.duracao = duracao;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Duração da mídia: " + this.duracao + " minutos");
    }
}
