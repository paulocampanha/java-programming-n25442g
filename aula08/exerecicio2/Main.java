package aula8.exerecicio2;

public class Main {

    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Gaspar", "Galego");
        Pessoa pessoa2 = new Pessoa("Jorge", "Branco", 25);

        pessoa1.apresentar();
        System.out.println("=".repeat(50));
        pessoa2.apresentar();
    }
    
}
