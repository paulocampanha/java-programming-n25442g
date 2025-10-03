
// Importação das classe em outros pacotes
import pacote1.Cachorro;
import pacote2.Pessoa;
import pacote3.Calculadora;

// Este é a definição da classe Principal
public class App {

    // Este é o metodo principal, o ponto de entrada do programa
    public static void main(String[] args) throws Exception {
        
        // Aqui, criamos uma instância de objeto chamado cachorro
        // a partir do "modelo" da classe Cachorro.
        // A chamada 'new Cachorro()' invoca o construtor padrão da classe Cachorro
        Cachorro cachorro = new Cachorro();
        Pessoa pessoa = new Pessoa();

        // chama o metodo 'latir()' da classe Cachorro
        cachorro.latir();
        pessoa.saudar();

        Calculadora calc = new Calculadora();

        // Variáveis que serão passadas como argumeto
        double valor1 = 123.45;
        double valor2 = 678.9;

        // Chama ao método somar e armazena o retorno do método
        // em outra variável
        double resultado = calc.somar(valor1, valor2);

        // Imprime o resultado
        System.out.println("O resultado da soma é " + resultado);

        valor1 = 25.99;
        valor2 = 50.5;

        System.out.println("O resultado da soma é "+ calc.somar(valor1, valor2));




    }
}
