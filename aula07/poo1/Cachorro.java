/**
 * Nessa classe vamos criar os atributos e metodos que serão usados
 * para criar abjetos do tipo cachorro
 */

package aula7.poo1;

public class Cachorro {
    
    //Atributos
    String nome;
    int idade;
    String raca;

    //Metodos
    public void latir(){
        System.out.println(this.nome + " está latindo...");
        System.out.println("Au! Au! Au!");
    }

    public void correr(){
        System.out.println(this.nome + " está correndo pelo campo.");
    }

    public void exibirDetalhas(){
        System.out.println("Nome do cachorro: " + this.nome);
        System.out.println("Idade do cachorro: " + this.idade);
        System.out.println("Raça do cachorro: " + this.raca);
    }
}
