package aula17.abstrata2;

public class Retangulo extends FormaGeometrica {

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura){
        super("Retângulo");
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea(){
        return altura * largura;
    }
    
}
