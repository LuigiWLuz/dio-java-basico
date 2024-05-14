package candidatura;
import java.util.concurrent.ThreadLocalRandom;


public class processoSeletivo {
    public static void main(String[] args){
        System.out.println("Processo Seletivo");
       // selecaoCandidatos();
       //imprimirSelecionados();
       String[] candidatos = {"Jão","Cleitin","Hernesto","Jeffin","Ronaldo"};

        for(String candidato : candidatos){
            atenderTelefone(candidato);
        }
       
        
    }

    static void atenderTelefone(String c){
       
            for(int j = 1; j < 4; ++j){
                  if(ThreadLocalRandom.current().nextInt(-1,2) == 1) {
                      System.out.println("Conseguimos contato com "+ c + " após " + j +" tentativa(s)." );
                      break;
                  }
                  else if(j > 2){
                      System.out.println("Não conseguimos contato com "+ c + "." );  
                  }
            }

    }

    static void imprimirSelecionados(){
        String[] candidatos = {"Jão","Cleitin","Hernesto","Jeffin","Ronaldo"};


        System.out.println("Imprimindo Candidatos Selecionados");

        for(int ind = 0; ind <candidatos.length ; ++ind){
            System.out.println(ind+1 +"- candidato: " + candidatos[ind]);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"Jão","Cleitin","Hernesto","Jeffin","Ronaldo","Omaga"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salariobase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual <  candidatos.length  ){
            String candidato = candidatos[candidatoAtual];
            if( valorPretendido() <= salariobase){
                System.out.println("O candidato " + candidato + " foi selecionado!");
                ++candidatosSelecionados;
            }
            ++candidatoAtual;
            
            
           
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double pretencaoSalarial){
        double salario = 2000.0;
        if(pretencaoSalarial < salario){
            System.err.println("Ligar para candidato");
        }
        else if(pretencaoSalarial == salario){
            System.err.println("Contraproposta Salarial");
        }
        else{
            System.out.println("Esperando resultado dos entrevistados...");
        }
    }
}
