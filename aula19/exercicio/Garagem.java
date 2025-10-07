package aula19.exercicio;

public class Garagem {
    
    public void estacionar(String placa){
        System.out.println("O carro de placa "+ placa 
        + " deve ser estacionado em vaga descoberta.");
    }

    public void estacionar(String placa, int vaga){
        System.out.println("O carro de placa "+ placa 
        + " deve ser estacionado na vaga " + vaga );
    }
}
