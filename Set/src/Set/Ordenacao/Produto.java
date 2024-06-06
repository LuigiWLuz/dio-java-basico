package Set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private String Nome;
    private int Cod;
    private double preco;
    private int Quantidade;


    public Produto(String Nome, int Cod, double preco, int Quantidade){
        this.Nome = Nome;
        this.Cod = Cod;
        this.preco = preco;
        this.Quantidade = Quantidade;
    }

    @Override
    public int compareTo(Produto P) {
       return Nome.compareToIgnoreCase(P.getNome());
    }


    public String getNome() {
        return Nome;
    }
    public int getCod() {
        return Cod;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return Quantidade;
    }

   

}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto Preco1, Produto Preco2) {
        return Double.compare(Preco1.getPreco(), Preco2.getPreco());
    }

}