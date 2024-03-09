package tp3;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclarer un tableau 1D de 10 éléments
        int[] tableau = new int[10];

        // Remplir le tableau avec les valeurs saisies par l'utilisateur
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Entrez la valeur pour l'élément " + (i + 1) + ": ");
            tableau[i] = scanner.nextInt();
        }

        // Afficher les éléments du tableau
        System.out.println("Les éléments du tableau sont :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Élément " + (i + 1) + ": " + tableau[i]);
        }

        scanner.close();
    }
}
