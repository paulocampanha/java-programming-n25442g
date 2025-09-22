/**
 * Nesse classe vamos implementar as variso formas do objeto
 * cachorro de acordo com seu construtor.
 */

package aula8.construtor1;

public class Main {

    public static void main(String args[]){

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Thor", 8);
        Cachorro cachorro3 = new Cachorro("Sansão", 6, "Pastor Alemão");
        
        System.out.println("=".repeat(50));
        cachorro1.exibirDetalhes();
        System.out.println("=".repeat(50));
        cachorro2.exibirDetalhes();
        System.out.println("=".repeat(50));
        cachorro3.exibirDetalhes();

        



    }
    
}
