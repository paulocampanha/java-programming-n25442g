/**
 * Nessa classe vamos instânciar os objetos da classe carro
 */
package aula7.poo2;

public class Main {

    public static void main(String args[]){
        //Criando objetos do tipo Carro
        Carro carro1 = new Carro("Fiat", "Uno", 2000);
        Carro carro2 = new Carro("Toyota", "Corola", 2010);

        System.out.println("\n--- Interagindo com os Carros ---");
        carro1.acelerar();
        carro1.exibirDados();
        System.out.println("=".repeat(50));
        carro2.acelerar();
        carro2.exibirDados();


    }
    
}
