/**
 * Nesse classe vamos implemetar os objetos da classe cachorro
 */
package aula7.poo1;

public class Main {
    
    public static void main(String args[]){

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();

        cachorro1.nome = "Totó";
        cachorro1.idade = 5;
        cachorro1.raca = "Poodle";

        cachorro2.nome = "Thor";
        cachorro2.idade = 2;
        cachorro2.raca = "Pitbull";

        cachorro1.latir();
        cachorro1.correr();
        cachorro1.exibirDetalhas();

        System.out.println("=".repeat(50));

        cachorro2.latir();
        cachorro2.correr();
        cachorro2.exibirDetalhas();
    }
}
