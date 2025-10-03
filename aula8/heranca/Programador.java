/**
 * Essa classe herda os atributos e metodos da classe funcionário e
 * implementa seu próprios atributos e métodos.
 */

package aula8.heranca;

public class Programador extends Funcionario {

    String linguagemDeProgramacao;

    // Construtor que chama o construtor da super classe
    public Programador(String nome, String cargo, 
    double salario, String linguagemDePrograma){
        super(nome, cargo, salario);
        this.linguagemDeProgramacao = linguagemDePrograma;        
    }

    // Método específico da subclasse
    public void codificar(){
        System.out.println(this.nome + " está escrevendo código em " +
        this.linguagemDeProgramacao + ".");
    }

    // Sobrescrita do método da suplerclasse para adicionar detalhes
    @Override
    public void exibirDetalhes(){
        //Reutilizar a exibição de detalhes do funcionario
        super.exibirDetalhes();
        System.out.println("Linguagem de Programação: " + this.linguagemDeProgramacao);
    }

    // Sobrescrita do método da superclasse para uma ação mais específica
    @Override
    public void tarefa(){
        System.out.println(this.nome + " está desenvolvendo o programa de tarefas.");
    }

    
}
