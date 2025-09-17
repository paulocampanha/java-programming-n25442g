/**
Exercícios de Estrutura de Decisão
1. Categorias de Produtos: Use um `switch` para imprimir a categoria de um produto com base em um código numérico. 
Por exemplo: 
1 = Eletrônicos, 2 = Vestuário, 3 = Alimentos. Inclua um caso `default` para "Código inválido".
 */

package aula4;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da categoria: ");
        int categoria = sc.nextInt();

        switch (categoria) {
            case 1:
                System.out.println("Produto da categoria Eletrônicos.");
                break;
            case 2:
                System.out.println("Produto da categoria Vestuário.");
                break;
            case 3:
                System.out.println("Produto da categoria Alimentos.");
                break;
            
            default:
            System.out.println("Código inválido para categoria");
                break;
        }
    }    
}
