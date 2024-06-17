package desafio_POO;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class bootcamp {

    private String nome;
    private String Descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFinal = dataInicio.plusDays(45);
    private Set<Devs> Devs = new HashSet<>();

    private Set<estrutura> Conteudos = new LinkedHashSet<>();

    public String getDescricao() {
        return Descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


   public LocalDate getDataFinal() {
       return dataFinal;
   }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public Set<estrutura> getConteudos() {
        return Conteudos;
    }

    public Set<Devs> getDevs() {
        return Devs;
    }

    public void SetConteudos(Set<estrutura> Conteudo){
        this.Conteudos = Conteudo;
    }

    public void SetDevs(Set<Devs> dev){
        this.Devs = dev;
    }
    
}
