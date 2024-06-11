package Desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {

      public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

       long Verifica = numeros.stream().filter(n -> n>=0).count();
       
       if(Verifica == numeros.stream().count())
          System.out.println("Todos os numeros são Positivos");
       else
         System.out.println(" Não são todos Positivos");
    }
}
