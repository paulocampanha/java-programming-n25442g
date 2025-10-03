package aula16.interface2;

public class Ecommerce {

    public static void main(String args[]){

        ProcessadorDePagamento cartao = new CartaoDeCredito();
        ProcessadorDePagamento pix = new Pix();

        cartao.processar(1500);
        pix.processar(250.75);
        
    }
    
}
