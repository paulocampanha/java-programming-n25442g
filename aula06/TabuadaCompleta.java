/**
 * Nesse programa vamos usar duas estruturas for, uma dentro da 
 * outra, para imprimir as tabuadas do 1 até o 10
 */

package aula6;

public class TabuadaCompleta {
    
    public static void main(String args[]){

        for (int i = 1; i <= 10; i++){
            System.out.println("=".repeat(30));
            System.out.println("Tabuada do " + i);

            // Laço for aninhado para imprimir cada tabuada
            for (int j = 1; j <= 10; j++){
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
