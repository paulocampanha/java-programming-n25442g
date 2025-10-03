package aula14.exercicio;

public class Main {

    public static void main(String[] args) {

        String nome = "Gaspar";
        int idade = 25;
        String cpf = "111.222.333.44";        
        
        Pessoa ps1 = new Pessoa(nome, idade, cpf);
        
        nome = "Luiza";
        idade = 30;
        cpf = "222.333.444-55";        
        
        Pessoa ps2 = new Pessoa(nome, idade, cpf);
        
        nome = "Anabela";
        idade = 16;
        cpf = "333.444.555-66";        
        
        Pessoa ps3 = new Pessoa(nome, idade, cpf);
        

        ps1.exibirInformacoes();
        ps2.exibirInformacoes();
        ps3.exibirInformacoes();
    }
    
}
