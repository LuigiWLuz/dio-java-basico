package desafio_POO;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
//import java.util.TreeSet;

public class Devs {

      private String nome;
      private Set<estrutura> conteudosInscritos = new LinkedHashSet<>();
      private Set<estrutura> conteudosEncerrados = new LinkedHashSet<>();



      public void inscreverBootcamp(bootcamp Bootcamp){
            this.conteudosInscritos.addAll(Bootcamp.getConteudos());
            Bootcamp.getDevs().add(this);

      }


      public void progredirBootcamp(){
            Optional<estrutura> conteudo = this.conteudosInscritos.stream().findFirst();
            if(conteudo.isPresent()){
                this.conteudosEncerrados.add(conteudo.get());
                this.conteudosInscritos.remove(conteudo.get());
            }
            else{
                System.err.println("Nenhum conteudo foi cadastrado!"); 
            }
      }


      public double calcularTotalXp(){
         return this.conteudosEncerrados.stream().mapToDouble( conteudo -> conteudo.calcularXP()).sum();
      }


      public Set<estrutura> getConteudosEncerrados() {
          return conteudosEncerrados;
      }



      public Set<estrutura> getConteudosInscritos() {
          return conteudosInscritos;
      }


      public String getNome() {
          return nome;
      }


      public void setConteudosEncerrados(Set<estrutura> conteudosEncerrados) {
          this.conteudosEncerrados = conteudosEncerrados;
      }


      public void setConteudosInscritos(Set<estrutura> conteudosInscritos) {
          this.conteudosInscritos = conteudosInscritos;
      }


      public void setNome(String nome) {
          this.nome = nome;
      }

}
