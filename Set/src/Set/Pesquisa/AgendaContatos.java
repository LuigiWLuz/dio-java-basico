package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;


public class AgendaContatos {
    private Set<Contato> SetContatos;

    public AgendaContatos(){
        this.SetContatos = new HashSet<>();
    }


    public void adicionarContatos(String nome, String NumTelefone){
        SetContatos.add(new Contato(nome, NumTelefone));
    }

    public void exibirContatos(){
        for(Contato C : SetContatos){
            System.out.println(C.getNumTelefone());
        }
    }

    public Set<Contato> pesquisarPorNome(String Nome){
        Set<Contato> SetContatosEncotrados = new HashSet<>();
        for (Contato C : SetContatos) {
            if(C.getNome().startsWith(Nome)){
                SetContatosEncotrados.add(C);
            }
        }
        return SetContatosEncotrados;

    }

   public Contato AtualizarContato(String nome, String NumTelefone){
        Contato ContatoAtualizado = null;
        for (Contato C : SetContatos) {
            if(C.getNome().equalsIgnoreCase(nome)){
                C.setNumTelefone(NumTelefone); 
                ContatoAtualizado = C;
                break;
            }
        }
       return ContatoAtualizado;
   }
}
