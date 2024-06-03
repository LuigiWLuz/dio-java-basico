package Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    
    private List<Livros> ListaLivros;



    public CatalogoLivros(){
        this.ListaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anopubli){
        ListaLivros.add(new Livros(titulo,autor,anopubli));
    }

    public List<Livros> pesquisaPorAutor(String autor){
        List<Livros> listaAutor = new ArrayList<>();
         if(!ListaLivros.isEmpty()){
            
         
         for(Livros T : ListaLivros){
            if(T.getAutor().equals(autor)){
                listaAutor.add(T);
            }
         
         
         }
        }
        return listaAutor;
    }


    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livros> ListaPesqAno = new ArrayList<>();
        if(!ListaLivros.isEmpty()){
            for(Livros AP : ListaLivros){
                    if(AP.getAnoPublicacao() >= anoInicial && AP.getAnoPublicacao() <= anoFinal){
                        ListaPesqAno.add(AP);
                    }
                
            }
        }
        return ListaPesqAno;
    }

 // esse eu fiz 
    public List<Livros> pesquisarPorTitulo(String titulo){
        List<Livros> primeiroLivro = new ArrayList<>();
        int cont = 0;
        if(!ListaLivros.isEmpty()){
            for(Livros PL : ListaLivros){
               while(cont < 1){
                if(PL.getTitulo().equals(titulo)){
                    ++cont;
                    primeiroLivro.add(PL);
                }
               }
            }
        }
        return primeiroLivro;
    }

// o do video

    public Livros pesquisarPorTitulo2(String titulo){
        Livros primeiroLivro = null;
        if(!ListaLivros.isEmpty()){
            for(Livros PL : ListaLivros){
                if(PL.getTitulo().equals(titulo)){
                    primeiroLivro = PL;
                    break;//quebra o for
                } 
            }
        }
        return primeiroLivro;
    }


    public static void main(String[] args){

        CatalogoLivros tet = new CatalogoLivros();

        tet.adicionarLivro("O Gato Preto", "Edgar Alan Poe", 1937);
        tet.adicionarLivro("A metamorfose", "Franz Kafka", 1948);
        tet.adicionarLivro("O principe", "Maquiavel", 1920);
        tet.adicionarLivro("Carta ao Pai", "Franz Kafka", 1932);

        System.out.println(tet.pesquisaPorAutor("Franz Kafka"));
        System.out.println(tet.pesquisarPorIntervaloAnos(1920,1937));
        System.out.println(tet.pesquisarPorTitulo2("O principe"));



    }
}