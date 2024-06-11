package Ordenacao;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDate;

public class AgendaEventos  {

    private Map<LocalDate,Evento> MapEventos;

    public AgendaEventos(){
        this.MapEventos = new HashMap<>();
    }

    public void adicionarEventos(LocalDate data, String nomeEvento, String nomeAtracao){
        MapEventos.put(data, new Evento(nomeEvento, nomeAtracao));
    }

    public void exibirAgenda(){
        Map<LocalDate,Evento> MapOrdenado = new TreeMap<>(MapEventos);
        System.out.println(MapOrdenado);
    }

    public void ProximoEvento(){
       
        // Set<LocalDate> ChavesMap = MapEventos.keySet();//pega todas as chaves do map
        // Collation<Evento> todosEventos = MapEventos.values() // pega todos os eventos
        //SÓ QUE ELE SAO PEGOS DE MANEIRA SEPARA ENTAO NAO POSSUI UM ASSOCIAÇAO ENTRE AS CHAVES E SEU RESPECTIIVOS VALORES

        // Utilizando o entrySet() ele retorna A chave e seu respectivo valor
;         Map<LocalDate,Evento> MapOrdenado = new TreeMap<>(MapEventos);
         LocalDate DataAtual = LocalDate.now();
         //Evento ProximoEvento = null;
         if(!MapOrdenado.isEmpty()){
           for(Map.Entry<LocalDate,Evento> entry : MapOrdenado.entrySet() ){
               if(/*entry.getKey().isEqual(DataAtual) ||*/ entry.getKey().isAfter(DataAtual)){
                  System.out.println("O proximo evento: " + entry.getValue() + " acontecerá na Data: " + entry.getKey());
                  break;
               }
           }

         }
        
         
    }

    

}
