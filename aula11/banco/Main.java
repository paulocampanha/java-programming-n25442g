package aula11.banco;

import java.util.Scanner;

public class Main {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        String numero = sc.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        
        Conta contaSalario = new Conta(numero, nome);

        ContaCorrente cc = new ContaCorrente("11234-5", 
        "Jorge Mendes", 5000.0);

        ContaPoupanca poupanca = new ContaPoupanca("51234-9",
        "Luiza Chaves");

        System.out.println("=".repeat(50));
        contaSalario.exibirSaldo();
        System.out.println("=".repeat(50));
        cc.exibirSaldo();
        System.out.println("=".repeat(50));
        poupanca.exibirSaldo();
        System.out.println("=".repeat(50));

        contaSalario.depositar(10000);
        cc.depositar(8500);
        poupanca.depositar(300000);

        System.out.println("=".repeat(50));
        contaSalario.exibirSaldo();
        System.out.println("=".repeat(50));
        cc.exibirSaldo();
        System.out.println("=".repeat(50));
        poupanca.exibirSaldo();
        System.out.println("=".repeat(50));

        contaSalario.sacar(13000);
        cc.sacar(5000);
        poupanca.sacar(50000);

        System.out.println("=".repeat(50));
        contaSalario.exibirSaldo();
        System.out.println("=".repeat(50));
        cc.exibirSaldo();
        System.out.println("=".repeat(50));
        poupanca.exibirSaldo();
        System.out.println("=".repeat(50));

    }
}
