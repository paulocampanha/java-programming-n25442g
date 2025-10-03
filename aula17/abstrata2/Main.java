package aula17.abstrata2;

public class Main {
    
    public static void main(String args[]){

        FormaGeometrica forma1 = new Circulo(5.0);
        FormaGeometrica forma2 = new Retangulo(4.0,6.0);

        System.out.println("----- Informações das Formas Geometricas -----");
        forma1.exibirInformacoes();
        System.out.println("=".repeat(30));
        forma2.exibirInformacoes();



    }
}
