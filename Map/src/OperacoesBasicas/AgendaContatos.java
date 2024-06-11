package OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;


public class AgendaContatos {

    private Map<String,Integer> mapAgenda;

    public AgendaContatos(){
        this.mapAgenda = new HashMap<>();
    }

    public void adicionaValores(String Nome, Integer Telefone){
        this.mapAgenda.put(Nome, Telefone);
    }

    public void removerValores(String Nome, Integer Telefone){
        if(!mapAgenda.isEmpty()){
            this.mapAgenda.remove(Nome);
        }
        else{
            System.out.println("O map está vazio");
        }
    }

    public void exibirContatos(){
        System.out.println(mapAgenda);
    }

    public Integer pesquisaPorNome(String Nome){
        if(!mapAgenda.isEmpty()){
           return mapAgenda.get(Nome);
        }
        return null;
    }

}
