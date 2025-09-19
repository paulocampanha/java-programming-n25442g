/**
 * Nesse programa vamos usar a estrutra do ... while para imprimir
 * uma lista de números.
 */

package aula6;
import java.util.Scanner;

public class Contador {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número menor que 10: ");
        int contador = sc.nextInt();

        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 10);

        System.out.println("=".repeat(50));
        System.out.println("Contagem finalizada.");
        sc.close();
    }
}
