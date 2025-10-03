package aula11.banco;

public class ContaPoupanca extends Conta{

    double juros;

    public ContaPoupanca(String numeroConta, String nomeCliente){
        super(numeroConta, nomeCliente);
    }

    public void aplicarJuros(double valor){
        this.juros = valor / 100;
        saldo = saldo + (saldo * this.juros);
    }
    
}
