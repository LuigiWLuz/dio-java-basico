package Desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {


     public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);
        
      int MaiorNum = numeros.stream().max((num1,num2) -> Integer.compare(num1,num2)).get();

        System.out.println(MaiorNum);

      long SegundoMaior = numeros.stream().filter(n->n!=MaiorNum).max((num1,num2)->Integer.compare(num1,num2)).get();

        
      System.out.println("Maior: " + MaiorNum);
      System.out.println("Segundo Maior: " + SegundoMaior);

    }



}
