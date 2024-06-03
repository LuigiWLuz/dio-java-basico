package Ordenacao.list;


import java.util.ArrayList;
import java.util.List;



public class CarrinhoDeCompras {

    private List<Item> listaDeItens;

    public CarrinhoDeCompras(){
        this.listaDeItens = new ArrayList<>();
    }


    public void adicionarItem(String nome, double preco, int quantidade){
        listaDeItens.add(new Item(nome,preco,quantidade));
    }


    public void removerItem(String nome){
        List<Item> listaRemoverItem = new ArrayList<>();

        for(Item RI : listaDeItens){
            if(RI.getNome().equalsIgnoreCase(nome)){
                listaRemoverItem.add(RI);
            }
        }
        listaDeItens.removeAll(listaRemoverItem);
    }



    public double calcularValorTotal(){
        double total = 0;
        for(Item VT : listaDeItens){
           double recebeValor = (VT.getPreco()*VT.getQuantidade
           ());
            total += recebeValor;
        }
        return total;
        
    }


    public void exibirItens(){
        for(Item EI : listaDeItens){
            System.out.println("Nome: "+EI.getNome()+", Preço: "+EI.getPreco()+", Quantidade: "+EI.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras tes = new CarrinhoDeCompras();

        tes.adicionarItem("Feijão", 5.67, 3);
        tes.adicionarItem("Açucar", 2.35, 1);
        tes.adicionarItem("Queijo", 4.12,6 );
        tes.adicionarItem("Açucar", 2.35, 3);

        tes.exibirItens();
        System.out.println( tes.calcularValorTotal());
        tes.removerItem("Açucar");
        System.out.println(tes.calcularValorTotal());
        
    }

}
