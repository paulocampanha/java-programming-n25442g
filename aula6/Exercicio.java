/**
 * Exercício:
 * Crie um programa usando a estrutura de repetição 'for', que peça ao usuário
 * para digitar 10 notas.
 * O programa deve calcular e imprimir a média final dessas notas. Para calcular
 * a média, some todas as notas e divida pelo número de notas.
 */
package aula6; 
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double soma = 0;
        double media = 0;

        for (int i = 1; i <= 10; i++){
            System.out.print("Digite a "+ i + "ª nota: ");
            nota = sc.nextDouble();
            soma += nota;
        }

        media = soma / 10;
        System.out.println("A média das notas é " + media);
    }
 }