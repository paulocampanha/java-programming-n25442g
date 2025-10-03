package aula17.abstrata2;

public class Circulo extends FormaGeometrica {

    private double raio;

    public Circulo(double raio){
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }


    
}
