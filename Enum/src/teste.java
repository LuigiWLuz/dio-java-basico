public class teste {

    public static void main(String[] args){

      for(estadoBrasileiro estado : estadoBrasileiro.values()){
           System.out.println(estado.getNome() + ", " + estado.getSigla());
      }
 

      estadoBrasileiro test = estadoBrasileiro.RIO_DE_JANEIRO;

      System.out.println(test.Maiusculo ());
    }

}
