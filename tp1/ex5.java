package tp1;
import java.util.Scanner;

public class ex5 {
    static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * fact(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int nbr = scanner.nextInt();
        scanner.close();

        int f = fact(nbr);
        System.out.println("La factorielle de " + nbr + " est : " + f);
    }
}
