package Ordenacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoas {

    private List<Pessoa> ListaPessoas;

    public OrdenacaoPessoas(){
        ListaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome,int idade, double altura){
        ListaPessoas.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> listaOrdenada = new ArrayList<>(ListaPessoas);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> listaOrdenada = new ArrayList<>(ListaPessoas);
        Collections.sort(listaOrdenada,new ComparatorPorAltura());
        return listaOrdenada;
    }

    
   
}
