package aula15.interface1;

public class Triangulo implements FormaGeometrica {

    private double altura;
    private double base;
    private double lado1;
    private double lado2;

    public Triangulo(double altura, double base, double lado1, double lado2){
        this.altura = altura;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;

    }
    
    @Override
    public double calcularArea(){
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro(){
        return base + lado1 + lado2;
    }
}
