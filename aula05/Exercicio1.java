/**
 * Faça um programa que solicitar ao usuário um número entre 1 
 * e 10 e imprime a tabuada desse número. Em seguida, pergunte se o 
 * usuário deseja imprimir outra tabuada. Se a resposta SIM, 
 * execute o procedimento acima novamente, se a resposta for não
 * encerre o programa.
 */

package aula5;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String traco = "=".repeat(50);
        int numero;
        while (true) {
            
            while (true){
                System.out.print("Digite um número entre 1 e 10: ");
                numero = sc.nextInt();

                if (numero >= 1 && numero <= 10) {
                    break;
                } else {
                    System.out.println("Número inválido. Tente novamente.");
                }
            }
            int contador = 1;
            System.out.println("Tabuada do " + numero + ":");
            while (contador <= 10) {
                System.out.println(numero + " x " + contador + " = " + (numero * contador));
                contador++;
            }
            System.out.print("Deseja imprimir outra tabuada? (S/N): ");            
            String resposta = sc.next();
            if (resposta.equalsIgnoreCase("N")){
                break;
            }
        }
        System.out.println("Programa encerrado. Até mais!");
        sc.close();
    }
}
