package aula7.poo3;

import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String produto = sc.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Digite a quantidade do produto em estoque: ");
        int quantidade = sc.nextInt();

        Produto produto1 = new Produto(produto, preco, quantidade);
        produto1.exibirDetalhes();

    }
}
