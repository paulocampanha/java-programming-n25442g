/*
 * Polimorfismo por interface.
 */
package aula19.polimorfismo;

public class Main {
    
    public static void main(String args[]){

        FormaGeometrica retangulo = new Retangulo(10, 5);
        FormaGeometrica circulo = new Circulo(8);

        // O polimorfismo nos permite tratar os objetos
        // de forma uniforme.
        System.out.println("Área do retangulo: " 
        + retangulo.calcularArea());
        System.out.println("Área do círculo: " 
        + circulo.calcularArea());
        
    }
}
