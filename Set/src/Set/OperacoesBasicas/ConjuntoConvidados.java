package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoConvidados {
  
     private Set<Convidado> ConjuntoConvidados;

     public ConjuntoConvidados(){
        this.ConjuntoConvidados = new HashSet<>();
     }

     public void adicionarConvidado(String nome, int CodConvite){

        ConjuntoConvidados.add(new Convidado(nome, CodConvite));
     }


     public void removerConvidadoporCodigo(int CodConvite){
       Convidado convidado = null;
        for(Convidado C : ConjuntoConvidados){
            if(C.getCodigoConvite() == CodConvite){
                convidado = C;
                //break pq nao vai ter outro elemento com mesmo codigo
                break;
            }
        }
        ConjuntoConvidados.remove(convidado);

     }

     public int contarConvidados(){
        return ConjuntoConvidados.size();
     }

     public void exibirConvidados(){
        for (Convidado C : ConjuntoConvidados) {
            System.out.println(C.getNome());
        }
     }


    //  @Override
    //  public boolean equals(Object Cod){
    //     if(this == Cod)return true;
    //     if(!(Cod instanceof Convidado ConjuntoConvidados))return false;
    //     return getCodigoConvite() == ConjuntoConvidados.getCodigoConvite();

    //  }

    //  @Override
    //  public int hashCode(){
    //     return Objects.hash(getCodigoConvite());
    //  }

     public static void main(String[] args) {
        ConjuntoConvidados dd = new ConjuntoConvidados();
        dd.adicionarConvidado("Craudio", 111);
        dd.adicionarConvidado("MarcelinhoDeCaçapava", 111);
        dd.adicionarConvidado("Tata", 222);
        dd.adicionarConvidado("Rusbé", 333);
        dd.adicionarConvidado("neima", 444);
       System.out.println( dd.contarConvidados());
        dd.exibirConvidados();
        dd.removerConvidadoporCodigo(333);
        dd.exibirConvidados();
     }
}
