public class pilhaDeExecucao {

   static void main(String[] args){

   }

   static void a(){
    System.out.print("Entrou no metodo a.");
    b();
    System.out.print("Finalizou o metodo a.");
   }

   static void b(){
    System.out.print("Entrou no metodo b.");
    for(int i = 0; i<=4;++i){
        System.out.print(i);
    }
    System.out.print("Finalizou o metodo b.");
   }
    
   static void c(){
    System.out.print("Entrou no metodo c.");
    //Thread.dumpStack();
    System.out.print("Finalizou o metodo c.");
   }
}
