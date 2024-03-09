package tp3;
import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Déclarer un tableau 1D de taille N
        int[] tableau = new int[taille];

        // Remplir le tableau avec les valeurs saisies par l'utilisateur
        for (int i = 0; i < taille; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        // Trouver le plus grand écart dans le tableau
        int plusGrandEcart = 0;
        for (int i = 0; i < taille - 1; i++) {
            int ecart = Math.abs(tableau[i] - tableau[i + 1]);
            if (ecart > plusGrandEcart) {
                plusGrandEcart = ecart;
            }
        }

        System.out.println("Le plus grand écart dans le tableau est : " + plusGrandEcart);

        scanner.close();
    }
}

