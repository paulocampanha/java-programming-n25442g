/**
 * Nesse programa vamos solicitar ao usuário um número inteiro e
 * imprimir a tabuada desse número.
 */

package aula6;
import java.util.Scanner;
public class Tabuada {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(30));
        System.out.print("Digite um número inteiro para  tabuada: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);
        }
        System.out.println("=".repeat(30));
        System.out.println("Fim da tabuada");
        
    }

}
