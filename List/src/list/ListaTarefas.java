package list;


import java.util.ArrayList;
import java.util.List;


public class ListaTarefas {
    
    private List<Tarefa> listaDeTarefas ;

    public ListaTarefas(){
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
       List<Tarefa> tarefaARemover = new ArrayList<>();

       for(Tarefa T : listaDeTarefas){
            if(T.getDescrição() == descricao){
                tarefaARemover.add(T);
            }
       }
       //remove da lista de tarefas tudo que tiver de igual na lista tarefaARemover 
       listaDeTarefas.removeAll(tarefaARemover);
    }
    

    public int obterNumeroTotalTarefas(){
        return listaDeTarefas.size();
    }
   

    public void obterDescricoesTarefas(){
         for(Tarefa T : listaDeTarefas){
             System.out.println(T.getDescrição());
         }
       // mostra a estrutura
       // System.out.println(listaDeTarefas);
    }


    public static void main(String[] args){

            ListaTarefas teste = new ListaTarefas();

            teste.adicionarTarefa("Fazer compras no Mercado");
            teste.adicionarTarefa("Fazer um jogo do Bicho");
            teste.adicionarTarefa("Terminar de Estudar Java");


            System.out.println(teste.obterNumeroTotalTarefas());

            teste.obterDescricoesTarefas();


            teste.removerTarefa("Fazer um jogo do Bicho");

            teste.obterDescricoesTarefas();


    }




}
