package aula15.interface1;

public class Main {
    
    public static void main(String args[]){

        FormaGeometrica retangulo = new Retangulo(10, 5);
        System.out.println("A área do retângulo é " 
        + retangulo.calcularArea());

        System.out.println("O perímetro do retângulo é " 
        + retangulo.calcularPerimetro());

        System.out.println("--------------------------\n");

        FormaGeometrica circulo = new Circulo(7);

        System.out.println("A área do círculo é " 
        + circulo.calcularArea());

        System.out.println("O perímetro do círculo é " 
        + circulo.calcularPerimetro());

        System.out.println("--------------------------\n");

        FormaGeometrica triangulo = new Triangulo(7.2, 8, 6, 10);

        System.out.println("A área do triângulo é " 
        + triangulo.calcularArea());

        System.out.println("O perímetro do triângulo é " 
        + triangulo.calcularPerimetro());

    }
}
