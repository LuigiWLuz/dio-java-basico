package Set.OperacoesBasicas;

public class Convidado {

    private String Nome;
    private int CodigoConvite;


    public Convidado(String no, int CodConvit){
        this.Nome = no;
        this.CodigoConvite = CodConvit;
    }

    public String getNome() {
        return Nome;
    }

    public int getCodigoConvite() {
        return CodigoConvite;
    }


}
