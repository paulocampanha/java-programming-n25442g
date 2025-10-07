package aula18.polimorfismo2;

public class Circulo extends FormaGeometrica {

    private double raio;

    public Circulo(double raio){
        super("Círculo");
        this.raio = raio;
    }

    public double getRaio(){
        return this.raio;
    }

    // Metodo concreto implementado obrigatoriamente do metodo
    // abstrato calcularArea()
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    
}
