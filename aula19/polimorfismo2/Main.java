package aula19.polimorfismo2;

public class Main {
    
    public static void main(String args[]){

        Area forma = new Area();

        // Chamando o método calcularArea() para um
        // quadrado
        double areaRetangulo = forma.calcularArea(5.0, 10.0);
        double areaCirculo = forma.calcularArea(5.0);

        System.out.println("Área do retângulo: " + areaRetangulo);
        System.out.println("Área do círculo: " + areaCirculo);
    }
}
