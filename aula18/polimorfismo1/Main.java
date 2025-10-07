package aula18.polimorfismo1;

public class Main {
    
    public static void main(String args[]){

        Animal cachorro1 = new Cachorro("Bruce");
        Cachorro cachorro2 = new Cachorro("Diana");

        cachorro1.comer();
        cachorro1.dormir();
        cachorro1.emitirSom();
  

        System.out.println("\n-----------------------");
        cachorro2.comer();
        cachorro2.dormir();
        cachorro2.emitirSom();
        cachorro2.abanarRabo();

        Animal animalGenerico = cachorro1;
        animalGenerico.setNome("Rex");
        

        System.out.println("Nome do animal: " 
        + cachorro1.getNome());
        
        System.out.println("Nome do animal generico: " 
        + animalGenerico.getNome());
    }
}
