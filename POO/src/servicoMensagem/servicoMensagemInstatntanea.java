package servicoMensagem;
public abstract class servicoMensagemInstatntanea {

    public abstract void enviarMensagem();
    public abstract void recebermensagem();


    protected void validarConexaoInternet(){
        
        System.out.println("Verificando conexão a internet ");
    }
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando a Mensagem no historico.");
    }

}
