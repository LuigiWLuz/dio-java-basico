package Set.Pesquisa;

public class Contato {
    private String Nome;
    private String NumTelefone;


    public Contato(String Nome, String NumTelefone){
        this.Nome = Nome;
        this.NumTelefone = NumTelefone;
    }

    public String getNome() {
        return Nome;
    }
    public String getNumTelefone() {
        return NumTelefone;
    }


    public void setNumTelefone(String numTelefone) {
        NumTelefone = numTelefone;
    }
}
