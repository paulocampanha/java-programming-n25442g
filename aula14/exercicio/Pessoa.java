package aula14.exercicio;

public class Pessoa {
    
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("O nome não pode ser vazio.");
        }
    }
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade>= 0) {
            this.idade = idade;
        } else {
            System.out.println("A idade não pode ser negativa.");
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.trim().isEmpty()){
            this.cpf = cpf;
        } else {
            System.out.println("O CPF não pode ser nulo.");
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
    }

    

}
