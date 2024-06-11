package Functional_Interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemple {


    public static void main(String[] args) {
       // Supplier<String> saudacao = () -> "Olá, seja bem vindo";

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo" ).limit(5).toList();


        listaSaudacoes.forEach(s -> System.out.println(s));

    }

}
