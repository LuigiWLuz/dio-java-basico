package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemple {

    public static void main(String[] args){


        List<String> listaLinguagem = Arrays.asList("Java","Kotlin","C++","PHP","JavaScript");


        Predicate<String> maisde5letras = linguagem -> 
        linguagem.length() > 5;


       // listaLinguagem.stream().filter(maisde5letras).forEach(n -> System.out.println(n));

        listaLinguagem.stream().filter(n->n.length()>5).forEach(n -> System.out.println(n));
        

    }
}
