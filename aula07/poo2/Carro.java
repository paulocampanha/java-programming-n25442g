/**
 * Nessa classe vamos criar os atributos e metodos que serão usados
 * para criar os objetos da classe carro.
 * Nessa classe, vamos definir um construtor de objetos, para 
 * garantir que os objetos sejam criados com as informações 
 * necessárias
 */

package aula7.poo2;

public class Carro {
    
    String marca;
    String modelo;
    int ano;

    //Construtor da classe
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar(){
        System.out.println("Acelerando o carro...");
    }

    public void exibirDados(){
        System.out.println("Marca do carro: " + this.marca);
        System.out.println("Modelo do carro: " + this.modelo);
        System.out.println("Ano do carro: " + this.ano);
    }
}
