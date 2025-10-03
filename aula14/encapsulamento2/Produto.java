/**
 * Nesse classe vamos usar o encapsulamento para proteger 
 * os atributos da classe
 */

package aula14.encapsulamento2;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;

    public Produto(String nome, double preco, 
                    int quantidade, String categoria){
        // Usando os setters para aplicar a validação dos atributos
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setCategoria(categoria);
    }

    // Getter para o nome
    public String getNome(){
        return this.nome;
    }

    // Setter para o nome
    public void setNome(String nome){
        if (nome != null && !nome.trim().isEmpty()){
            this.nome = nome.trim();
        } else {
            System.out.println("Nome do produto não pode ser vazio");
        }
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        if (preco >= 0){
            this.preco = preco;
        }else {
            System.out.println(
                "O preço do produto não pode ser negativo.");
        }
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(int quantidade){
        if (quantidade > 0){
            this.quantidade = quantidade;
        } else {
            System.out.println(
                "A quantidade não pode ser negativa");
        }
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setCategoria(String categoria){
        if (categoria != null && !categoria.trim().isEmpty()){
            this.categoria = categoria;
        } else {
            System.out.println("A categoria não pode ser vazia.");
        }
    }

    public void exibirDetalhes(){
        System.out.println("=".repeat(50));
        System.out.println("Produto: " + this.nome);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Preço: R$ " + String.format("%.2f",this.preco));
        System.out.println("Quantidade: " + this.quantidade);
        double total = this.quantidade * this.preco;
        System.out.println("Valor Total R$ " + String.format("%.2f",total));
        System.out.println("=".repeat(50));
    }
    
}
