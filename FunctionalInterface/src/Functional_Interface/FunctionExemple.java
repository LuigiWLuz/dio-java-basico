package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
//import java.util.stream.Stream;

public class FunctionExemple {

   public static void main(String[] args){


     List<Integer> ListaNumeros = Arrays.asList(1,2,3,4,5,6);



    Function<Integer,Integer> dobrar = numero -> numero * 2;
    List<Integer> ListaDobrados = ListaNumeros.stream().map(dobrar).toList();
    

    ListaDobrados.forEach(n -> System.out.println(n));



   }

}
