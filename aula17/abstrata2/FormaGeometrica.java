package aula17.abstrata2;

public abstract class FormaGeometrica {

    private String nome;

    public FormaGeometrica(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    // Método abstrato
    public abstract double calcularArea();

    // Método concreto
    public void exibirInformacoes(){
        System.out.println("Forma: " + nome);
        System.out.println("Área calculada: " + calcularArea());

    }
    
}
