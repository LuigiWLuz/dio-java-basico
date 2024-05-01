public class Operadores {

    public static int somar(int a,int b){
        return a+b;
     }

     public static void mostrar(){
        System.out.print("Esse numero não é divisivel por 2, logo, é IMPARRRRRR!");
     }
    public static void main(String[] args) {
    //     String nomecompleto = "Linguagem " + "Java";
    //    int fei = 1;

    //     for(int i = 0; i <= 3; ++i) {
    //         System.out.println(nomecompleto);
            
    //         fei += 2;
    //         System.out.print(fei);
    //     }


    //   boolean trueFalse = true;
    //   System.out.print(!trueFalse); 
    //    System.out.print(trueFalse); 


    //   int i = 6,j = 4;



    // //   String result = i % 2 == 0 ? "Par" : "Impar";
    // //   System.out.println(result);

    //   if(i < 4 || i >= 6)
    //     System.out.println("Numero valido");
    //   else
    //     System.out.println("Numero invalido");




    //     if(i%2 == 0 && j%2 == 0)
    //     System.out.print("Ambos os numeros são pares!");
    // else
    //     System.out.print("UM dos numeros não é par");
      
    //        
            int r = somar(34, 7);
            System.out.println("Soma: " + r);
            if(r%2 != 0)
              mostrar();
     }


    
    
}
