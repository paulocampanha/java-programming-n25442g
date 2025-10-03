/**
 * As Lojas Marilu estão precisando de um pragrama para calcular as 
 * parcelas dos clientes para compra de seus produtos. Solicitou que você 
 * fizesse um programa para seus venderos utilizarem em suas vendas. 
 * Esse programa deve calcular o valor das parcelas e imprimir um pequeno
 * carnê de pagamento seguindo as condições abaixo:
 * Para pagamentos a vista, desconto de 15% no valor do produto;
 * Para pagamento a prazo de 2 até 10 vezes, parcelas sem juros.
 * Para pagamento acima de 10 vezes, acrescímo de 1% em cada parcela sobre 
 * o número de parcelas, ou seja, se o cliente for pagar em 15 vezes, terá 
 * um acréscimo de 15% sobre o valor do produto.
 * Importante, as parcelas não podem últrapassar 18 vezes.
 */

package aula4;

import java.util.Scanner;

public class Parcelas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String traco = "=".repeat(50);
        System.out.println(traco);
        System.out.println("Lojas Marilu");
        System.out.println(traco);
        System.out.println("***** Sistema de Vendas *****");
        System.out.println("-".repeat(50));
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();
        System.out.print("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();
        int numeroParcelas = 0;

        while (true){
            System.out.print("Digite o número de parcelas ou 0 para finalizar: ");
            numeroParcelas = sc.nextInt();
            if (numeroParcelas < 0 || numeroParcelas > 18){
                System.out.println("Número de parcelas inválido. Tente novamente");
            } else {
                break;
            }
        }

        if (numeroParcelas == 1) {
            valorProduto = valorProduto - (valorProduto * 0.15);
            System.out.println("Valor a pagar R$ " + valorProduto);
            System.out.println("Solicite ao cliente se dirigir ao caixa.");
        } else if (numeroParcelas > 1 && numeroParcelas <= 10) {
            System.out.print("Escolha o melhor dia para pagamento entre 5, 10, 15 ou 25: ");
            int diaPagamento = sc.nextInt();
            double valorParcela = valorProduto / numeroParcelas;
            int mesPagamento = 10;
            int anoPagamento = 2025;
            System.out.println(traco);
            System.out.println("***** Carnê de Pagamento *****");
            System.out.println(traco);
            int contador = 1;
            while (contador <= numeroParcelas){
                System.out.print("Parcela " + contador+ ": ");
                System.out.print(diaPagamento+"/"+mesPagamento+"/"+anoPagamento);
                System.out.printf(": R$ %.2f",valorParcela);
                mesPagamento += 1;
                if (mesPagamento > 12){
                    mesPagamento = 1;
                    anoPagamento += 1;
                }
                contador += 1;
            }
             
        } else if (numeroParcelas > 10 && numeroParcelas <= 18){
            double juros = (1 * numeroParcelas) / 100;
            valorProduto = valorProduto + (valorProduto * juros);
            
            System.out.print("Escolha o melhor dia para pagamento entre 5, 10, 15 ou 25: ");
            int diaPagamento = sc.nextInt();
            double valorParcela = valorProduto / numeroParcelas;
            int mesPagamento = 10;
            int anoPagamento = 2025;
            System.out.println(traco);
            System.out.println("***** Carnê de Pagamento *****");
            System.out.println(traco);
            int contador = 1;
            while (contador <= numeroParcelas){
                System.out.print("Parcela " + contador+ ": ");
                System.out.print(diaPagamento+"/"+mesPagamento+"/"+anoPagamento);
                System.out.printf(": R$ %.2f\n",valorParcela);
                mesPagamento += 1;
                if (mesPagamento > 12){
                    mesPagamento = 1;
                    anoPagamento += 1;
                }
                contador += 1;
            }
        }

        System.out.println(traco);
        System.out.println("Sistema de Gestão de Loja");
        System.out.println(traco);
        
        
    }
}
