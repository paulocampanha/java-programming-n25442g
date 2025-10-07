package aula18.polimorfismo2;

public abstract class FormaGeometrica {

    private String nome;

    public FormaGeometrica(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    // Método abstrato
    public abstract double calcularArea();
    
    // Método concreto
    public void exibirInformacoes(){
        System.out.println("Forma: " + this.nome);
        System.out.println("Área calculada: " + String.format("%.2f", calcularArea()));
    }



}
