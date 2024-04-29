public class MinhaClasse{
    
    public class  Dog {
        String cor = "Marrom";
        double Tamanho = 1.20;
    
        
    }
    public static void main(String[] args) {
         
        // final String BR = "Brasil";
        // System.out.print(BR);
        

        String meuNome = "Helicopter";
        int anoFabricacao = 2013;
        Dog Spike;
        //Spike.cor;
        String nomeCompleto = nomeCompleto("Mike", "Maluco");
        System.out.println(nomeCompleto);

        
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome + " " + segundoNome;
    }
}