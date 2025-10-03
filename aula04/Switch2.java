/**
 * Nesse programa vamos usar uma variável do tipo String para as opções
 * do switch...case
 */
package aula4;
import java.util.Scanner;
public class Switch2 {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a menção do aluno (D/ED/ND): ");
        String mencao = sc.next();
        mencao = mencao.toUpperCase();

        switch (mencao) {
            case "D":
                System.out.println("Desenvolvido.");
                System.out.println("Aluno(a) Aprovado(a).");
                break;
            case "ED":
                System.out.println("Em Desenvolvimento.");
                System.out.println("Aluno(a) está de Recuperação.");
                break;
            case "ND":
                System.out.println("Não Desenvolvido");
                System.out.println("Aluno(a) Reprovado.");
                break;
            default:
                System.out.println("Menção inválida para o aluno.");
        }
        System.out.println("=".repeat(50));
        System.out.println("          Escola Senai");
        
    }
}
