
// Importação de classes em outros pacotes
import pacote1.Cachorro;
import pacote2.Pessoa;
import pacote3a.Calculadora;

//  Esta é a definição da classe Principal.
public class App_copy {

    //Este é o método principal, o ponto de entrada do programa.
    public static void main(String[] args) throws Exception {
        
        // Aqui, criamos uma instância de objeto chamada cachorro 
        // a partir do "modelo" da classe Cachorro. 
        // A chamada new Cachorro() invoca o construtor padrão da classe Cachorro.
        Cachorro cachorro = new Cachorro();

        // Da mesma forma, criamos uma instância de objeto chamada pessoa 
        // a partir do "modelo" da classe Pessoa. 
        // A chamada new Pessoa() invoca o construtor padrão da classe Pessoa.
        Pessoa pessoa = new Pessoa();

        // Chama o método 'latir' da classe Cachorro
        cachorro.latir();

        // Chama o método 'saudar' da classe Pessoa
        pessoa.saudar();

        // Aqui, criamos uma instância de objeto chamada calculadora 
        // a partir do "modelo" da classe CAlculadora. 
        // A chamada new CAlculadora() invoca o construtor padrão da classe Calculadora.
        Calculadora calc = new Calculadora();

        // Variáveis que serão passadas como argumentos
        int numero1 = 13;
        int numero2 = 50;

        // Chama o método 'somar' e armazena o resultado
        int resultado = calc.somar(numero1, numero2);
        // Aqui, o programa chama o método somar do objeto utilitario.

        // Imprime o resultado final
        System.out.println("O resultado da soma é: " + resultado);



    }
}
