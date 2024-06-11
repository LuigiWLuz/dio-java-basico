package Desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        
        
       long verifica = numeros.stream().distinct().count();
       if(verifica ==  numeros.size())
            System.out.print("Todos os numeros são distintos");
       else
             System.out.print("Nem todos os numeros distintos");

    }
}
