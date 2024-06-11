package Desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {

     public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3,23);
        
        long Verifica = numeros.stream().filter(n->n>10).count();

       if(Verifica > 0)
        System.out.println("Existem numeros maiores que 10 na lista.");
       else
       System.out.println("Não existem numeros maiores que 10 na lista.");
    }
}
