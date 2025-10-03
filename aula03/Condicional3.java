/**
 * Nesse programa vamos estuda o uso da estrutura condicional if...else if...else
 */
package aula3;

import java.util.Scanner;

public class Condicional3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = sc.nextInt();
        int anoAtual = 2025;
        int idade = anoAtual - anoNascimento;

        System.out.print("Você já fez aniversário esse ano S/N? ");
        String resposta = sc.next();

        if (resposta.equalsIgnoreCase("n")){
            idade -= 1;
        }

        System.out.println("Você tem " + idade + " anos.");

        if (idade >=0 && idade < 12) {
            System.out.println("Você é uma criança.");
        } else if (idade > 12 && idade <= 17) {
            System.out.println("Você é adolescente.");
        } else if (idade > 17 && idade <=59) {
            System.out.println("Você é adulto.");
        } else {
            System.out.println("Você é idoso.");
        }

        System.out.println("=".repeat(30));

    }
}
