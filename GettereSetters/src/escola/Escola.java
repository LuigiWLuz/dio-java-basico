package escola;

public class Escola {
    public static void main(String[] args){
       
        Aluno felipe = new Aluno();

        felipe.setNome("Felipe");
        felipe.setIdade(14);

        System.out.print("O aluno "+ felipe.getNome() +" tem "+felipe.getIdade()+" anos de idade");



    }

}
