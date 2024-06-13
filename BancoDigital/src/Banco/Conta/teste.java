package Banco.Conta;

public class teste {
    public static void main(String[] main){
        Cliente cliente1 = new Cliente("Manel", 30, "M");
        Cliente cliente2 = new Cliente("Junin", 20, "M");
        Cliente cliente3 = new Cliente("Maria", 25, "F");
        Cliente cliente4 = new Cliente("Darwin", 67, "M");
        Cliente cliente5 = new Cliente("Fernanda",18 , "F");
        Cliente cliente6 = new Cliente("Richarelli", 20, "F");

        Conta cc1 = new ContaCorrente(cliente1);
        Conta CP1 = new ContaPoupanca(cliente2);
        Conta cc2 = new ContaCorrente(cliente3);
        Conta CP2 = new ContaPoupanca(cliente4);
        Conta cc3 = new ContaCorrente(cliente5);
        Conta CP3 = new ContaPoupanca(cliente6);
         cc1.depositar(200);
         cc1.imprimirExtrato();
         CP1.imprimirExtrato();
         cc1.transferir(CP2, 70);
         cc1.imprimirExtrato();
         CP2.imprimirExtrato();
         cc1.apresentarListaClientes();
    
    }
}
