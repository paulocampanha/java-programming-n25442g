package aula19.polimorfismo2;

public class Area {
    
    // Método para calcular a área do retângulo
    public double calcularArea(double base, double altura){
        return base * altura;
    }

    // Método para calcular a área do circulo
    public double calcularArea(double raio){
        return Math.PI * Math.pow(raio, 2);
    }
}
