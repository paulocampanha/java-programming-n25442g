/**
 * Sobrecarga na Clase Geometria
1 - Crie uma classe chamada Geometria
2 - Crie um método chamado calcularArea que aceita um parâmetro double para o raio e retone a área de um círculo. Use a fórmula: PI = 3.14159
area = PI * (raio * raio)
area = PI * Math.pow(raio, 2)
3 - Sobrecarregue o método calcularArea para que aceite dois parâmetros double (base e altura) e retorne a área de um triângulo. Use a formula: 
area = (base * altura) / 2
4 - No método main, instancie a classe Geometria e teste ambos os métodos calcularArea com diferentes valores. 
 */

package aula8.exercicio1;

public class Main {

    public static void main(String[] args) {
        
        Geometria circulo = new Geometria();
        Geometria triangulo = new Geometria();

        System.out.println("A área do círculo de raio 10 é " 
                    + circulo.calcularArea(10));
        System.out.println("A área do triangulo de base 10 e altura 5 e " 
                    + triangulo.calcularArea(10, 5));
    }
    
}
