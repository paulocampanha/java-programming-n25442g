/**
 * Nessa classe vamos criar modelos para trabalhar com produtos 
 * de um estoque.
 */

package aula7.poo3;

public class Produto {
    
    //Atributos
    String nome;
    double preco;
    int quantidadeEstoque;

    //Construtor
    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        System.out.println("Produto '" + this.nome + "' adicionado ao catálogo.");
    }

    //Método para calcular o valor total em estoque para este produto
    public double calcularValorTotalEstoque() {
        double totalEstoque = this.preco * this.quantidadeEstoque;
        return totalEstoque;
    }

    public void exibirDetalhes(){
        System.out.println("=".repeat(50));
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço R$ " + String.format("%.2f", this.preco));
        System.out.println("Estoque: " + this.quantidadeEstoque + " unidades.");
        System.out.println("Valor Total em Estoque: R$ " + 
            String.format("%.2f", calcularValorTotalEstoque()));
    }
}
