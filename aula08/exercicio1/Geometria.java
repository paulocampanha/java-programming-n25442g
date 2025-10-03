package aula8.exercicio1;

public class Geometria {

    public double calcularArea(double raio){

        double area = 3.14159 * (raio * raio);
        return area;
    }

    public double calcularArea(double base, double altura){

        double area = (base * altura) / 2;
        return area;
    }
    
}
