package exerciciofixacao_2.application.entities;

public class Estoque {
    private String nome;
    private double preco;
    private int quantidade;

    public Estoque(String nome, double preco, int quantidade) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
    }

    public Estoque(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String nomeGet() {
        return nome;
    }

    public void nomeSet(String nome) {
        this.nome = nome;
    }

    public double precoGet() {
        return preco;
    }

    public void precoGet(double preco) {
        this.preco = preco;
    }

    public int quantidadeGet() {
        return quantidade;
    }

    public double valorEstoque() {
        return preco * quantidade;
    };

    public int adcEstoque(int quantidade) {
        return this.quantidade += quantidade;
    }

    public int rmvEstoque(int quantidade) {
        return this.quantidade -= quantidade;
    }

    public String toString() {
        return "Dados do produto: " + nome + " | $ " + String.format("%.2f", preco) + quantidade + " | unidades"
                + " | Total: $" + String.format("%.2f", valorEstoque());
    }
}
