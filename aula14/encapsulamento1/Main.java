package aula14.encapsulamento1;

public class Main {
    
    public static void main(String args[]){

        Pessoa pessoa1 = new Pessoa("Gaspar", 18, 5000);


        pessoa1.exibirInformacoes();


        System.out.println("getNome: " + pessoa1.getNome());
        pessoa1.setNome("Gaspar Neve");

        System.out.println("=".repeat(50));
        System.out.println("getNome: " + pessoa1.getNome());

        pessoa1.exibirInformacoes();

        pessoa1.setIdade(-18);
        pessoa1.setSalario(500.00);
        pessoa1.exibirInformacoes();

        System.out.println("=".repeat(50));
        pessoa1.setIdade(18);
        pessoa1.setSalario(10000);
        pessoa1.exibirInformacoes();

    }
}
