package aula18.polimorfismo1;

public class Cachorro extends Animal {

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Au! Au! Au1");
    }

    public void abanarRabo(){
        System.out.println("Cachorro abanando o rabo.");
    }

    @Override
    public void comer(){
        System.out.println("O cachorro está comento ração canina.");
    }
    
}
