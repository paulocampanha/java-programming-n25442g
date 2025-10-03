/**
 * Nesse programa vamos estudar o uso de atributos imutáveis
 * chamados também de 'constantes'
 */

package aula15.contantes;

public class Constante {

    public static void main(String args[]){

        // Constante para um valor número fixo usado em calculos
        final double TAXA_JUROS_ANUAL = 0.125;

        // Constante para uma string de mensagem ou ientificador
        final String NOME_AMBIENTE = "PRODUÇÃO";

        // Constante para valor int
        final int LIMITE_MAXIMO_USUARIOS = 500;

        // Constante para armazenar o número PI
        final double PI = 3.14159265359;

        System.out.println("Ambiente atual: " + NOME_AMBIENTE);
        System.out.println("Limite de Usuários: " + LIMITE_MAXIMO_USUARIOS);

        // Exemplo de calculo usando a constante
        double valorEmprestimo = 10000.00;
        double jurosAnual = valorEmprestimo * TAXA_JUROS_ANUAL;

        System.out.println("Valor do Empréstimo: R$" 
        + String.format("%.2f", valorEmprestimo));
        System.out.println("Taxa de Juros Anual: " 
        + String.format("%.1f", TAXA_JUROS_ANUAL * 100) + "%");
        System.out.println("Valor do Juros: R$ " 
        + String.format("%.2f", jurosAnual));

    }
    
}
