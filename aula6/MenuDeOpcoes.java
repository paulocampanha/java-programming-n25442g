/**
 * Nesse programa vamos exibir um menu de opções simples. O laço
 * do-while mantem o menu ativo até que o usuário escolha a opção 
 * sair.
 */

package aula6;
import java.util.Scanner;

public class MenuDeOpcoes {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=".repeat(30));
            System.out.println("----- MENU DE OPÇÕES -----");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Alterar dados do cliente");
            System.out.println("3 - Excluir cliente");
            System.out.println("4 - Pesquisar dados do cliente");
            System.out.println("5 - Sair do Sistema");
            System.out.println("=".repeat(30));
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Acessando o modulo de cadastro de clientes");
                    break;
                case 2: 
                    System.out.println("Acessando o modulo de alteração dos dados do cliente.");
                    break;
                case 3: 
                    System.out.println("Acessando o modulo de exclusão de clientes.");
                    break;
                case 4:
                    System.out.println("Acessando o modulo de pesquisa dos dados do cliente.");
                    break;
                case 5:
                    System.out.println("Saindo do Sistema...");
                    break;
                default:
                System.out.println("opção inválida! Tente novamente.");
            }
            
        } while(opcao != 5);
        sc.close();
    }
}
