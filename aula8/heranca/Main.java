package aula8.heranca;

public class Main {
    
    public static void main(String args[]){

        System.out.println("----- Gestão de Funcionárioa -----");
        Funcionario funcionario1 = new Funcionario("Gaspar", "Auxiliar de Escritório", 3500.00);
        Gerente gerente1 = new Gerente("Luiza", "Gerente de Projetos", 8000.00, "Desenvolvimento");
        Programador programador1 = new Programador("Jorge", "Desenvolvedor Junior", 5000.00, "Java");

        funcionario1.exibirDetalhes();
        funcionario1.tarefa();

        System.out.println("=".repeat(50));

        gerente1.exibirDetalhes();
        gerente1.gerenciarEquipe();
        gerente1.tarefa();

        System.out.println("=".repeat(50));

        programador1.exibirDetalhes();
        programador1.codificar();
        programador1.tarefa();
        
    }
}
