package variaveis;
import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");

        String nome = scanner.nextLine();

        System.out.println("Óla " + nome + "!");
       
        System.out.println("Digite a sua idade:");  

        int idade = scanner.nextInt();

        System.out.println(nome + " Você tem " + idade + " anos.");

        scanner.close();



    }
}
