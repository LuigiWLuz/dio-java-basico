import java.util.Scanner;
import java.util.Locale;

public class AboutMe {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Insira o nome: ");
        String nome = scanner.next();
        System.out.print("Insira o sobrenome: ");
        String sobreNome = scanner.next();
        System.out.print("Insira sua Idade: ");
        int idade = scanner.nextInt();


        System.out.print("Olá, " + nome + " "+ sobreNome.concat(", Tenho ") +  idade + " Anos.");
    }
    
}
