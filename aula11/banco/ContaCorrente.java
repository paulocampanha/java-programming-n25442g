package aula11.banco;

public class ContaCorrente extends Conta {

    double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, String nomeCliente,
                double limiteChequeEspecial){
        super(numeroConta, nomeCliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void exibirSaldo(){
        super.exibirSaldo();
        System.out.println("Limite R$ " + String.format("%.2f", this.limiteChequeEspecial));
        
    }
    
}
