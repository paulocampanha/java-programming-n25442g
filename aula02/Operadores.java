/**
 * Nesse programa vamos praticar o uso de operadores 
 */
package aula2;

public class Operadores {

    public static void main(String args[]){

        String traco = "=";
        System.out.println(traco.repeat(30));
        System.out.println("--- Exemplos de Operadores ---");

        // Variáveis de exemplo
        int num1 = 13;
        int num2 = 27;
        double num3 = 5.55;
        boolean cond1 = true;
        boolean cond2 = false;

        // Operadores de atribuição
        System.out.println("\n--- Operadores de Atribuição---");
        System.out.println("Variáveis: num1 = " + num1 + ", num2 = " + num2);

        // Atribuição simples
        int numero = num1;
        System.out.println("Valor de número: " + numero);

        // Atribuição combinada (adição)
        num1 += 5;   // Equivalente a -> num1 = num1 + 5
        System.out.println("num1 += 5: " + num1);

        // Atribuição combinada (subtração)
        num2 -= 5;   // Equivalente a ->  num2 = num2 - 5
        System.out.println("num2 -= 5: " + num2);

        // Atribuição combinada (multiplicação)
        num1 *= 5;    // Equivalente a ->  num1 = num1 * 5
        System.out.println("num1 *=: " + num1);

        // Atribuição combinada (divisão)
        num2 /= 5;    // Equivalente a -> num2 = num2 / 5
        System.out.println("num2 /= 5: " + num2);

        num3 /= 2;
        System.out.println("num3 /= 2: " + num3);

        // Atribuição combinada (módulo)
        num1 %= 2;   // Equivalente a -> num1 = num1 % 2
        System.out.println("num1 %= 2: " + num1);

        // Operadores de Comparação
        System.out.println(traco.repeat(30));
        System.out.println("\n--- Operadores de Comparação ---");

        // Igual a (==)
        System.out.println("num1 == 4: " + (num1 == 4));  // false
        System.out.println("num2 == 4: " + (num2 == 4));  // true

        // Diferente de (!=)
        System.out.println("num1 != 4: " + (num1 != 4));  // true
        System.out.println("num2 != 4: " + (num2 != 4));  // false

        // Maior que (>) e Maior ou Igual  (>=)
        System.out.println("num1 > 4: " + (num1 > 4));  // false
        System.out.println("num2 >= 4: " + (num2 >= 4));  // true 

        // Menor que (<) e Menor ou Igual  (<=)
        System.out.println("num1 < 4: " + (num1 < 4));  // true
        System.out.println("num2 <= 4: " + (num2 <= 4));  // true
        
        // Operadores Lógicos  (&& (and - e)  - || (or - ou) ! (not - não))
        System.out.println(traco.repeat(30));
        System.out.println("\n--- Operadores Lógicos ---");
        System.out.println("(num1 < 4) && (num2 <= 4)? " + ((num1 < 4) && (num2 <= 4)) );
        System.out.println("(num1 > 4) && (num2 <= 4)? " + ((num1 > 4) && (num2 <= 4)) );
        System.out.println("(num1 > 4) && (num2 > 4)? " + ((num1 > 4) && (num2 > 4)) );
        System.out.println(traco.repeat(30));
        System.out.println("(num1 < 4) || (num2 <= 4)? " + ((num1 < 4) || (num2 <= 4)) );
        System.out.println("(num1 > 4) || (num2 <= 4)? " + ((num1 > 4) || (num2 <= 4)) );
        System.out.println("(num1 > 4) || (num2 > 4)? " + ((num1 > 4) || (num2 > 4)) );
        System.out.println(traco.repeat(30));
        System.out.println("cond1: " + cond1);
        System.out.println("cond2: " + cond2);
        System.out.println("!cond1: " + !cond1);
        System.out.println("!cond2: " + !cond2);


        


    }
    
}
