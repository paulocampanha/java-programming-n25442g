package aula17.abstrata1;

// A classe é declara como 'abstract', portanto não
// pode ser instanciada 
public abstract class Animal {
    
    // Atributo concreto: 
    private String nome;

    // Construtor
    public Animal(String nome){
        this.nome = nome;
    }

    // Método concreto:
    public void dormir(){
        System.out.println(this.nome + " está dormingo tranquilamente.");
    }

    public String getNome(){
        return this.nome;
    }

    // Método abstrato
    public abstract void emitirSom();
}
