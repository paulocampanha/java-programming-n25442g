package aula18.polimorfismo2;

public class Main {
    
    public static void main(String args[]){

        FormaGeometrica circulo1 = new Circulo(3.0);
        Circulo circulo2 = new Circulo(7.0);
        FormaGeometrica retangulo = new Retangulo(5.0, 8.0);

        exibirArea(circulo1);
        exibirArea(circulo2);
        exibirArea(retangulo);

    }

    public static void exibirArea(FormaGeometrica forma){

        System.out.println("Nome do objeto: " + forma.getNome());
        System.out.println("Área calculada: " + forma.calcularArea());
    }
}
