package Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    private List<Integer> ListaNumerosInt;

    public SomaNumeros(){
        this.ListaNumerosInt = new ArrayList<>();
    }

   public void adicionarNumero(int num){
        ListaNumerosInt.add(num);

   }

   public int calcularSoma(){
        int Soma = 0;
        for(Integer V : ListaNumerosInt){
             Soma += V;
        }
        return Soma;
   }

   public int encontraMaiorNumero(){
        int maiorValor = Integer.MIN_VALUE;
        for(Integer V : ListaNumerosInt){
            if(V >= maiorValor)
               maiorValor = V;
        }

        return maiorValor;

   }

   public int encontraMenorNumero(){
    int menorValor = Integer.MAX_VALUE;
    for(Integer V : ListaNumerosInt){
        if(V <= menorValor)
           menorValor = V;
    }
    return menorValor;
}


    public void exibirNumeros(){
        for(Integer num : ListaNumerosInt){
            System.out.print(num + ", ");
        }
    }

    public static void main(String[] args) {

        SomaNumeros aa = new SomaNumeros();

        aa.adicionarNumero(2);
        aa.adicionarNumero(-4);
        aa.adicionarNumero(7);
        aa.adicionarNumero(0);

        aa.exibirNumeros();


       System.out.println( aa.calcularSoma());
       System.out.println( aa.encontraMaiorNumero());
       System.out.println(aa.encontraMenorNumero());
    }



}
