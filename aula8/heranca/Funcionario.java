/**
 * Nesse classe vamos implementar os atributos e métodos gerais
 * a todos os funcionários
 */

package aula8.heranca;

public class Funcionario {

    String nome;
    String cargo;
    double salario;

    // Construtor
    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        System.out.println("Funcionário(a) " + this.nome + " cadastrado com sucesso");
    }

    public void exibirDetalhes(){
        System.out.println("=".repeat(50));
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: " + String.format("%.2f", this.salario));
    }
    
    public void tarefa(){
        System.out.println(this.nome + " acaba de receber uma tarefa por e-mail");
    }
}
