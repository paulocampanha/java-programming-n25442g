/**
 * Nesse programa vamos estudar o uso da estrutura condicional if ... else
 */
package aula3;
import java.util.Scanner;

public class Condicional2 {

    public static void main(String args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Filme em cartaz: Demon Slayer: Kimetsu no Yaiba.");
        System.out.println("=".repeat(50));
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você pode assitir ao filme.");
            System.out.println("Bom Filme.");
        } else {
            System.out.println("Infelizmente, você não pode assitir esse filme.");
        }

        System.out.println("=".repeat(50));
        
    }
}
