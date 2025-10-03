package aula14.encapsulamento1;

public class Pessoa {
    
    private String nome;
    private int idade;
    private double salario;


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("A idade não pode ser negativa.");
        }
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        if (salario >= 1518.00 ){
            this.salario = salario;
        } else {
            System.out.println(
                "Salário inválido. Abaixo do salário mínimo.");
        }
    }

    public Pessoa(String nome, int idade, double salario){
        this.nome = nome;
        setIdade(idade);
        setSalario(salario);
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: R$ " + salario);
    }
}
