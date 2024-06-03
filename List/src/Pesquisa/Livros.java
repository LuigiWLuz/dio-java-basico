package Pesquisa;

public class Livros {
    private String titulo;
    private String autor;
    private int anoPublicacao;


    public Livros(String ti, String au, int an){
        this.titulo = ti;
        this.autor = au;
        this.anoPublicacao = an;
    }


    public int getAnoPublicacao() {
        return anoPublicacao;
    }



    public String getAutor() {
        return autor;
    }


    public String getTitulo() {
        return titulo;
    }
}
