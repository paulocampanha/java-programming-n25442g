package aula14.encapsulamento2;

import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();
        System.out.print("Digite o preço do produto: ");
        double precoProduto = sc.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        int qtdeProduto = sc.nextInt();
        System.out.print("Digite o nome da categoria: ");
        String nomeCategoria = sc.nextLine();

        Produto novoProduto = new Produto(nomeProduto, precoProduto,
        qtdeProduto, nomeCategoria);

        novoProduto.exibirDetalhes();

        sc.close();
    }
}
