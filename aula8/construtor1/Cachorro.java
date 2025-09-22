/**
 * Nesse classe vamos ilustrar o uso da sobrecarga com construtores
 */
package aula8.construtor1;

public class Cachorro {

    String nome;
    int idade;
    String raca;

    // Construtor 1: Inicializa o cachorro sem nenhum atributo
    // Assinatura do construtor: Cachorro()
    public Cachorro(){
        System.out.println("Cachorro anonimo criado.");
    }

    // Construtor 2: Inicializa o cachorro com nome e idade
    // Assinatura do construtor: Cachorro(String, int)
    public Cachorro(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.println("Cachorro " + this.nome + " criado.");
    }

    // Construtor 3: Inicializa o cachorro com nome, idade e raça
    // Assinatura do construtor: Cachorro(String, int, String)
    public Cachorro(String nome, int idade, String raca){
        // Chamando o segundo construtor para reutilizar o código
        // A palavra-chave 'this()' deve ser a primeira da linha
        this(nome, idade);
        this.raca = raca;
        System.out.println("Cachorro " + this.nome + " da raça " 
                                                + this.raca + " criado.");
    }
    
    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Raça: " + this.raca);
    }
}
