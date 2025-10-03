package aula16.interface2;

public class Pix implements ProcessadorDePagamento {

    @Override
    public void processar(double valor){
        System.out.println("Processando R$ " 
        + valor + " via PIX.");
    }
}
