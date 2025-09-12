/**
 * Nesse programa vamos trabalhar com a classe que repesenta uma
 * sequência de caracteres. 
 */
package aula1;

public class TipoString {
    
    public static void main(String args[]){

        // Declarando e inicializando um objeto do tipo String
        String nome = "Gaspar";
        String sobrenome = "Neve";

        // Concatenação de STrings
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println(nomeCompleto);

        // Usando um método da classe String para verificar o comprimento do objeto
        int tamanho = nomeCompleto.length();
        System.out.println("O nome completo tem " + tamanho + " caracteres.");

        // Convertendo para letras minúsculas ou maiúsculas
        String nomeMinusculo = nome.toLowerCase();  
        // .toLowerCase() -> converte as letras em minúsculas
        System.out.println("Nome minúsculo: " + nomeMinusculo);

        String sobrenomeMaiusculo = sobrenome.toUpperCase();  
        // .toUpperCase() -> converte as letras em maiúsculas.
        System.out.println("Sobrenome maiúsculo: " + sobrenomeMaiusculo);

        // Verificando string vazia
        String nada = "";
        System.out.println("O nome está vazio: " + nome.isEmpty());
        System.out.println("O nada está vazio: " + nada.isEmpty());
        // isEmpty() retorna 'true' se o objeto estiver vazio.

        String nome2 = nome;
        System.out.println("Outro nome: " + nome2);

        nome = "Jorge";

        System.out.println("Nome:" + nome);
        System.out.println("Nome2:" + nome2);




    }
}
