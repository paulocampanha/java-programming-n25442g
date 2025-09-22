/**
 * Nessa classe vamos usar a sobrecarga de métodos
 */
package aula8.sobrecarga2;

public class Calculadora {

    // Método 1: Somar dois números inteiros
    public static int somar(int a, int b){
        int soma = a + b;
        return soma;
    }

    // Método 2: Somar três números inteiro
    public static int somar(int a, int b, int c){
        int soma = a + b + c;
        return soma;
    }

    public static void main(String args[]){

        int x = 13;
        int y = 29;
        int z = 44;

        System.out.println("A soma de " + x + " e " + y + " é igual a" 
        + somar(x, y));

        System.out.println("=".repeat(50));
        System.out.println("A soma de " + x + ", " + y + " e " + z +
        " é igual a " + somar(x, y, z));
    }
    
}
