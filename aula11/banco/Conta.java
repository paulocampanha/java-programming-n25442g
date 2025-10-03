package aula11.banco;

public class Conta {
    
    String numeroConta;
    String nomeCliente;
    double saldo;

    public Conta(String numeroConta, String nomeCliente){
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;   // this.saldo = this.saldo + valor
        } else {
            System.out.println("Valor do deposito inválido");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else if (valor > this.saldo){
            System.out.println("Saldo insuficiente para o saque.");
        } else {
            System.out.println("Valor do saque inválido.");
        }
    }

    public void exibirSaldo(){
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("Saldo atual R$ " + String.format("%.2f", this.saldo));
    }
}
