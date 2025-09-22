package aula7.exercicio;

public class Main {
    
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Gaspar",25, "Programador Java");
        Pessoa pessoa2 = new Pessoa("Luiza",35, "Professora Java");
        Pessoa pessoa3 = new Pessoa("Anabela",25, "Estudante de Java");

        System.out.println("=".repeat(50));
        pessoa1.apresentar();
        System.out.println("=".repeat(50));
        pessoa2.apresentar();
        System.out.println("=".repeat(50));
        pessoa3.apresentar();
        System.out.println("=".repeat(50));

    }
}
