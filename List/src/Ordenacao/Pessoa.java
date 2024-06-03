package Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private int idade;
    private double altura;


    public Pessoa(String no, int id, double al){
        this.nome = no;
        this.idade = id;
        this.altura = al;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade,p.getIdade());
    }


    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }

   
    

}

 class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
        
}