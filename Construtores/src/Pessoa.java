public class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;


    public Pessoa(String nome,String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }


     public String getNome(){
         return nome;
     }

    // public void setNome(String newNome){
    //     nome = newNome;
    // }


     public String getCpf(){
         return cpf;
     }

    // public void setCpf(String newCpf){
    //    cpf = newCpf;
    // }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String newEndereco){
        this.endereco = newEndereco;
    }

}
