/**
 * Essa classe vai herdar os atribus e metodos da classe funcionario
 * e implementar seus próprios métodos e atributos
 */
package aula8.heranca;


public class Gerente extends Funcionario {

    String departamentoResponsavel;

    
    // Construtor
    public Gerente(String nome, String cargo, double salario, String deptoResponsavel){
        super(nome, cargo, salario);
        this.departamentoResponsavel = deptoResponsavel;
    }

    public void gerenciarEquipe(){
        System.out.println(this.nome + " é responsavel pelo departamento"
        + this.departamentoResponsavel);
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Departamento Responsável: " + this.departamentoResponsavel);
        System.out.println("Responsabilidade: Gerente de Equipe");
    }

    @Override
    public void tarefa(){
        System.out.println(this.nome + ", envou um e-mail de tarefas aos colaboradores do departamento.");
    }
    
}
