package tp2;
import java.util.Scanner;

public class ex5a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier (N) : ");
        int N = scanner.nextInt();

        scanner.close();

        int fact = 1;
        int i = 1;

        while (i <= N) {
            fact *= i;
            i++;
        }

        System.out.println("Factorielle de " + N + " est : " + fact);
    }
}
