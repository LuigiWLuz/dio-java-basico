package Ordenacao;

public class Evento {

    private String NomeEvento;
    private String NomeAtracao;

    public Evento(String NomeEvento,String NomeAtracao){
        this.NomeEvento = NomeEvento;
        this.NomeAtracao = NomeAtracao;
    }

    public String getNomeAtracao() {
        return NomeAtracao;
    }

    public String getNomeEvento() {
        return NomeEvento;
    }


}
