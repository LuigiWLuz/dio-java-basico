import java.util.Scanner;
import java.util.Locale;


public class Conta_Terminal {
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor insira seu Numero de conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor insira sua Agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor insira Nome e Sobrenome: ");
        String nome = scanner.next();
        String sobrenome = scanner.next();

        System.out.println("Por favor insira seu Saldo: ");
        Double Saldo = scanner.nextDouble();



        System.out.print("Olá ".concat(nome) + " ".concat(sobrenome) + ", obrigado por criar uma conta em nosso banco, sua agencia é "+ agencia.concat(", ") + "conta " + numeroConta + " e seu saldo de R$" + String.format(
           " %.2f", Saldo) + " já está disponivel para saque." );
       
    }
}
