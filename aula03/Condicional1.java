/**
 * Nesse programa vamos estudar a estrutura condicional if
 */

package aula3;
import java.util.Scanner;

public class Condicional1 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Você não digitou um número positivo.");
        }

        System.out.println("Número digitado: " + numero);
    }
    
    
}
