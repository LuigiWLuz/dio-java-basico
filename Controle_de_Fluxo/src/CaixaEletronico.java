public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
       double saldo = 57.3;
       double valorRetirado = 42.3;
       String escolha = "M";

    //    if(valorRetirado <= saldo){
    //     saldo -= valorRetirado;
    //     System.out.print("Saldo retirado com sucesso!, saldo restante: R$ " + saldo);
    // }
    //    else  
    //      System.out.print("Saldo Insuficiente!");


    // System.out.print(valorRetirado<saldo?saldo-=valorRetirado:valorRetirado==saldo?"Retirado com sucesso!":"Não é possivel fazer essa operação");


    switch(escolha){
        case "P": System.out.print("Tamanho Pequeno"); break;
        case "M": System.out.print("Tamanho Medio"); break;
        case "G": System.out.print("Tamanho Grande");break;
        default: System.out.print("Valor não encontrado!"); break;
    }

        
        
    }
}
