package aula17.abstrata1;

public class Main {
    
    public static void main(String args[]){

        // Criando instâncias concretas
        
        Animal cachorro = new Cachorro("Bruce");
        Animal gato = new Gato("Gaspar");
        

        
        System.out.println("\n----- Chamando o metodo dormir() -----");
        cachorro.dormir();
        gato.dormir();

        System.out.println("\n----- Chamando o método emitirSom() -----");
        cachorro.emitirSom();
        gato.emitirSom();


    }
}
