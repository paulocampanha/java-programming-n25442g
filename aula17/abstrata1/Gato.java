package aula17.abstrata1;

public class Gato extends Animal {

    // Chama o contrutor da super classe (classe mãe)
    public Gato(String nome){
        super(nome);
    }

    // Implementação obrigatoria do método abstrato
    @Override
    public void emitirSom() {
        System.out.println(getNome() 
        + " está miando: Miau... Miau... Miau!");
    }
    
}
