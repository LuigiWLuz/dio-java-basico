package Banco.Conta;


import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements iConta {    

    //Padrão sempre estar como privado e possuir um construtor 
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;
    protected List<Cliente> ListaClientes;


    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
       // AdicionarClienteLista(cliente);
    }

    public int getAgencia() {
        return agencia;
    }
    public int getConta() {
        return conta;
    }
    public double getSaldo() {
        return saldo;
    }



    private void AdicionarClienteLista(Conta inicia,Cliente cliente){
        if(SEQUENCIAL == 1){
            ListaClientes = new ArrayList<>(); 
            ListaClientes.add(cliente);
        }
        else if(SEQUENCIAL == inicia.SEQUENCIAL){
            inicia.ListaClientes.add(cliente);
        }
       
    }


    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
        }
        else{
            System.out.println("Saque não efetuado, saldo insuficiente, insira outro valor de saque ou deposite o valor faltante.");
        }
            
    }

    public void depositar(double valor){
        System.out.println("Insira o valor de deposito:");
        saldo += valor;

    }


    protected void informaçõesConta() {
        
        System.out.println("Proprietário da Conta: "+ cliente.getNome());
        System.out.println(String.format("Agencia: %d",agencia));
        System.out.println(String.format("Conta: %d",conta));
        System.out.println(String.format("Saldo: R$ %.2f", saldo));
    }

    public void transferir(Conta contaDestino, double valor){
        //this representa a variavel no qual chamou esse metodo
        this.sacar(valor);
        contaDestino.depositar(valor);
    }



    public void apresentarListaClientes(){
        System.out.println("Lista de Clientes");
        ListaClientes.forEach(n->System.out.println(n.getNome()));
    }
    
}
