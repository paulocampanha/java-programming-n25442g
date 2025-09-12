/* Nesse programa vamos fazer a introdução de Java trabalhando 
 * com tipos primitivos da linguagem
 * 
 */
package aula1;

public class TiposPrimitivos {

    public static void main(String args[]){

        // Tipos primitivos para número inteiros
        byte idade = 20;   // byte armazena números de -128 a 127
        System.out.println("Idade do aluno: " + idade);

        short capacidade = 30000; // short armazena números de -32.768 a 32.767
        System.out.println("Capacidade do recipiente: " + capacidade + " litros.");

        int premio = 1_500_000_000; // int armazena números de -2.147.483.648 a 2.147.483.647 
        System.out.println("Prêmio acumulado: " + premio + " latas de leite.");

        long populacao = 7_800_000_000_000L; //long armazena um número de -9.223.372.036.845.775.808 até 9.223.372.036.845.775.807  
        System.out.println("População mundial de borboletas: " + populacao);

        int idade2 = 25;
        long premio2 = 1_500_000_000L;  // L declara o cast do tipo de dados

        // Tipos primitivos para números decimais (ponto flutuante)
        float altura = 1.75f; // float armazena um número com até 7 casas depois da vírgula
        System.out.println("Altura do aluno: " + altura);

        double pi = 3.14159265359; // double armazena um número com até 15 casas depois da vírgula
        System.out.println("Número do PI: " + pi);

        // Tipo primitivo para valores lógicos
        boolean eAluno = true; 
        boolean fumante = false;
        System.out.println("Gaspar é aluno: " + eAluno);
        System.out.println("É fumante: " + fumante);

        // Tipo primitivo de um caracter
        char primeiraLetra = 'S'; // O tipo char só aceita um único caracter entre aspas SIMPLES
      System.out.println("Primeira letra de Sena: " + primeiraLetra);
    }
}


