package aula18.polimorfismo1;

public abstract class Animal {
    
    // Atributo concreto
    private String nome;

    // Construtor  
    public Animal(String nome){
        this.nome = nome;
    }

    // Metodo concreto
    public void dormir() {
        System.out.println(this.nome 
        + " está dormindo tranquilamente.");
    }

    public String getNome(){
        return this.nome;
    }

    public void comer(){
        System.out.println(this.nome + " está comendo algo.");
    }

    // Método abstrato
    public abstract void emitirSom();

    public void setNome(String nome){
        this.nome = nome;
    }

}
