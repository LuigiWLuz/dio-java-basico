package servicoMensagem;
public class MSNMesssager extends servicoMensagemInstatntanea {

    @Override
     public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando Mensagem pelo MSN.");
        salvarHistoricoMensagem();
    }

    @Override
    public void recebermensagem(){
        validarConexaoInternet();
        System.out.println("Enviando Mensagem pelo MSN.");
        salvarHistoricoMensagem();

    }

   

}
