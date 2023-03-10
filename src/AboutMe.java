import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu Primeiro nome: ");
        String firstName = scanner.next();

        System.out.print("Digite seu Sobrenome: ");
        String lastName = scanner.next();

        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double height = scanner.nextDouble();

        System.out.println("Seu nome é: " + firstName + " " + lastName);
        System.out.println("Sua idade é: " + age);
        System.out.println("Sua altura é: " + height);




    }
}
