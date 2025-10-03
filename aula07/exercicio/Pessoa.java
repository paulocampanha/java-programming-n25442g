package aula7.exercicio;

public class Pessoa {
    
    String nome;
    int idade;
    String profissao;

    public Pessoa (String nome, int idade, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public void apresentar(){
        System.out.printf("olá meu nome é %s, tenho %d e sou %s.\n",this.nome, this.idade, this.profissao);
    }
}
