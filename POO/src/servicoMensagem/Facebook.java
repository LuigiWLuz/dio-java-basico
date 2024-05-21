package servicoMensagem;
public class Facebook extends servicoMensagemInstatntanea {

    @Override
    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando Mensagem pelo Facebook.");
        salvarHistoricoMensagem();
    }

    @Override
    public void recebermensagem(){
        validarConexaoInternet();
        System.out.println("Enviando Mensagem pelo Facebook.");
        salvarHistoricoMensagem();

    }
}
