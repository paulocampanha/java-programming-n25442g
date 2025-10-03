/**
 * Nesse programa vamos estudar a estrutura condicional switch...case.
 * Essa estrutura e parecida com a estrutura 'if' ou seja, um bloco de código
 * é executado se a opção do case for igual.
 */
package aula4;
import java.util.Scanner;
public class Switch1 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 7 para saber o dia da semana: ");
        int num = sc.nextInt();
        System.out.print("Esse número corresponde ao dia da semana: ");
        switch (num) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número da semana inválido.");
        }

        switch (num){
            case 6:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dia útil!");
                break;
            case 1:
            case 7:
                System.out.println("Final de semana!");
                break;

        }
        
        
        System.out.println("=".repeat(50));
        System.out.println("Fim do Programa");
    }
    
}
