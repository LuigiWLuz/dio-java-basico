package Banco.Conta;

public class Cliente {

    private String nome;
    private int Idade;
    private String sexo;

    public Cliente(String nome, int Idade,String sexo){
        this.nome = nome;
        this.Idade = Idade;
        this.sexo = sexo;
    }

    public int getIdade() {
        return Idade;
    }
    public String getNome() {
        return nome;
    }
    public String getSexo() {
        return sexo;
    }


}
