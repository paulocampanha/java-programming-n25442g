/**
 * Nesse programa vamos somar 5 numeros fornecidos pelos usuário
 * usando a estrutura for
 */
package aula6;
import java.util.Scanner;

public class SomarNumeros {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int limite = 5;
        int numero = 0;
        int soma = 0;

        for (int i = 1; i <= limite; i++){
            System.out.print("Digite o número na posição " + i + ": ");
            numero = sc.nextInt();
            soma += numero;
        }
        System.out.println("A soma dos número é " + soma);
    }
}
