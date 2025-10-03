package aula8.exerecicio2;

public class Pessoa {
    
    String nome;
    String sobrenome;
    int idade;

    public Pessoa (String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
    }
    public Pessoa (String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        if (idade > 0){
            System.out.println("Idade: " + this.idade + " anos.");
        } else {
            System.out.println("Idade: não informada");
        }

    }


}
