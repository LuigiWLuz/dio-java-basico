package Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoNumeros {

    private List<Integer>ListaNumeros;

    public OrdenacaoNumeros(){
        this.ListaNumeros = new ArrayList<>();
    }


    
    public void adicionarNumero(int num){
        ListaNumeros.add(num);
    }

    public void ordenarAscendente(){
       List<Integer> listaOrdenada = new ArrayList<>(this.ListaNumeros);
       if(!ListaNumeros.isEmpty()){
          Collections.sort(listaOrdenada);
          for(Integer N : listaOrdenada){
            System.out.print(N + " ");
        }
       }
       else{
          throw new RuntimeException("Lista Vazia!!!");
       }
    }

    public void ordenarDecrescente(){
        List<Integer> listaOrdenadaDesc = new ArrayList<>(this.ListaNumeros);

        if(!ListaNumeros.isEmpty()){
           listaOrdenadaDesc.sort(Collections.reverseOrder());
           for(Integer N : listaOrdenadaDesc){
               System.out.print(N);
           }
        }
        else{
            throw new RuntimeException("Tava vazio zé!");
        }
    }
    
    public static void main(String[] args) {
        OrdenacaoNumeros ere = new OrdenacaoNumeros();
        ere.adicionarNumero(9);
        ere.adicionarNumero(2);
        ere.adicionarNumero(-4);
        ere.adicionarNumero(7);
        ere.adicionarNumero(92);
        ere.adicionarNumero(1);

        ere.ordenarAscendente();
        ere.ordenarDecrescente();

    }

}
