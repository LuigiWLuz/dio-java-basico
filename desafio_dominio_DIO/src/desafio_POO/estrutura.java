package desafio_POO;

//import java.time.LocalDate;

public abstract class estrutura {

    private String Titulo;
    private String Descricao;
    protected static final double XP_PADRAO = 100;




    public String getDescricao() {
        return Descricao;
    }


    public String getTitulo() {
        return Titulo;
    }


    public void setDescricao(String descricao) {
        Descricao = descricao;
    }


    public void setTitulo(String titulo) {
        Titulo = titulo;
    }


     public abstract double calcularXP();
}
