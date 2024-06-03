package Ordenacao.list;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;


    public Item(String no, double pre, int quant){
        this.nome = no;
        this.preco = pre;
        this.quantidade = quant;
    }


    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }


}
