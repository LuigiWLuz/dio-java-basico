package servicoMensagem;
public class Telegram extends servicoMensagemInstatntanea {

     @Override
     public void enviarMensagem(){
         validarConexaoInternet();
         System.out.println("Enviando Mensagem pelo Telegram.");
         salvarHistoricoMensagem();
     }

     @Override
     public void recebermensagem(){
        validarConexaoInternet();
         System.out.println("Enviando Mensagem pelo Telegram.");
         salvarHistoricoMensagem();
     }


}
