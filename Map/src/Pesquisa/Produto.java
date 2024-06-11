package Pesquisa;

public class Produto {
    private String Nome;
    private int quantidade;
    private double preco;


    public Produto(String Nome, int Quantidade, double preco){
        this.Nome = Nome;
        this.quantidade = Quantidade;
        this.preco = preco;
    }


    public String getNome() {
        return Nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
