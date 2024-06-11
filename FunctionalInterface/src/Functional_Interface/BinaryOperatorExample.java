package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args){

        List<Integer> ListaNumeros = Arrays.asList(1,2,4,5,6,8,9);

    //     BinaryOperator<Integer> Soma = (num1,num2) -> num1+num2;

    //    int resultado = ListaNumeros.stream().reduce(0,Soma);

    int resultado = ListaNumeros.stream().reduce(0,(num1,num2)->num1+num2);

       System.out.println(resultado);

    }

}
