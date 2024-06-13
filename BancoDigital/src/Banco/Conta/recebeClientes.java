package Banco.Conta;

import java.util.ArrayList;
import java.util.List;

public class recebeClientes {

    protected List<Cliente> ListaClientes;

   public void adicionarClientes(int SEQUENCIAL,Cliente cliente){
        if(SEQUENCIAL == 1){
            ListaClientes = new ArrayList<>();
            ListaClientes.add(cliente);
        }
       else
          ListaClientes.add(cliente);

    }


   public List<Cliente> retornaClientes(){
        return ListaClientes;
    }
}
