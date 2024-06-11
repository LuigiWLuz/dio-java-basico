package Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long,Produto> mapProdutos;

    public EstoqueProdutos(){
        mapProdutos = new HashMap<>();
    }

    public void adicionarProduto(long Cod,String Nome, int Quantidade, double preco){
        mapProdutos.put(Cod, new Produto(Nome, Quantidade, preco));
    }

    public void exibirProdutos(){
       if(!mapProdutos.isEmpty()){
        System.out.println(mapProdutos);
       }
    }

    public double calcularTotalEstoque(){
        double total = 0d;
        if(!mapProdutos.isEmpty()){
            for(Produto Val : mapProdutos.values())    
                total +=  Val.getQuantidade() * Val.getPreco();
        }
        return total;
    }

    public Produto obterProdutoMaisCaro(){
        Produto ProdutoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        if(!mapProdutos.isEmpty()){
            for(Produto Val : mapProdutos.values()){
                if(Val.getPreco() > maiorValor){
                    ProdutoMaisCaro = Val;
                }
            }   
        }
        return ProdutoMaisCaro;
    }


    public Produto obterProdutoMaisBarato(){
        Produto ProdutoMaisBarato = null;
        double menorValor = Double.MAX_VALUE;
        if(!mapProdutos.isEmpty()){
            for(Produto Val : mapProdutos.values()){
                if(Val.getPreco() < menorValor){
                    ProdutoMaisBarato = Val;
                }
            }   
        }
        return ProdutoMaisBarato;
    }


}
