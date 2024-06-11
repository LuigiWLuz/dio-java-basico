package Functional_Interface;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args){

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);



        //USANDO METHOD INTERFACE E LAMBDA
        // Consumer<Integer> imprimirNumerosPar = numero -> { 
        //     if(numero % 2 == 0)
        //         System.out.println();
        // };
        // numeros.stream().forEach(imprimirNumerosPar);


        //USANDO METHOD INTERFACE
        // numeros.stream().forEach(new Consumer<Integer>(){
        //     @Override
        //     public void accept(Integer numero){
        //         if(numero%2==0)
        //            System.out.println(numero);
        //     }
        // });

        /// USANDO LAMBDA

        // numeros.stream().forEach(numero -> {
        //     if(numero%2==0)
        //     System.out.println(numero);
        // });


        //Agora Usando tambem o predicate

            numeros.stream().filter(numero -> numero%2==0).forEach(n->System.out.println(n));

    }




}
