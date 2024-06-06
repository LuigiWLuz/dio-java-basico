package Set.Ordenacao;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> SetProdutos;

    public CadastroProdutos(){
        this.SetProdutos = new HashSet<>();
    }


    public void adicionarProdutos(String Nome, int Cod, double preco, int Quantidade){
        SetProdutos.add(new Produto(Nome, Cod, preco, Quantidade));
    }


    public void exibirPorNome(){
        Set<Produto> exibirPorNome = new TreeSet<>(SetProdutos);
        for (Produto P : exibirPorNome) {
            System.out.println(P);
        }
    }


    public void exibirPorPreco(){
        Set<Produto> exibirPreco = new TreeSet<>(new ComparatorPorPreco());
        if(!SetProdutos.isEmpty()){
            exibirPreco.addAll(SetProdutos);
            for (Produto p : exibirPreco) {
                System.out.println(p);

            }

    }
    }





}
