import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {

    public static void main(String[] args){

        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Insira o nome: ");
        String nome = scanner.next();
        System.out.print("Insira o sobrenome: ");
        String sobreNome = scanner.next();
        System.out.print("Insira sua Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Olá, " + nome + " "+ sobreNome.concat(", Tenho ") +  idade + " Anos.");
       }
       catch(InputMismatchException e){
            System.out.print("Insira um numero! nao uma letra zé ruéla.");
        }


     }     
    
}
