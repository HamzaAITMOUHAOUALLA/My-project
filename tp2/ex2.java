package tp2;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre réel (X) : ");
        double X = scanner.nextDouble();

        System.out.print("Entrez un entier (N) : ");
        int N = scanner.nextInt();

        scanner.close();

        double resultat = 1.0; // Initialisation du résultat

        // Calcul de la puissance
        while (N > 0) {
            resultat *= X;
            N--;
        }

        System.out.println(X + " à la puissance " + N + " est égal à " + resultat);
    }
}

