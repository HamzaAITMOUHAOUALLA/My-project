package tp1;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre réel (x) : ");
        double x = scanner.nextDouble();

        System.out.print("Entrez un entier (n) : ");
        int n = scanner.nextInt();

        scanner.close();

        double resultat = 1.0; // Initialisation du résultat

        // Calcul de la puissance
        for (int i = 0; i < n; i++) {
            resultat *= x;
        }

        System.out.println(x + " à la puissance " + n + " est égal à " + resultat);
    }
}

