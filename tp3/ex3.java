package tp3;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille N
        int N;
        do {
            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            N = scanner.nextInt();
        } while (N < 10 || N > 50);

        // Déclarer un tableau 1D de taille N
        int[] T = new int[N]; // Modification du nom du tableau

        // Remplir le tableau avec les valeurs saisies par l'utilisateur
        for (int i = 0; i < N; i++) {
            System.out.print("Entrez la valeur pour l'élément " + (i + 1) + " : ");
            T[i] = scanner.nextInt();
        }

        // Afficher les éléments du tableau
        System.out.println("Les éléments du tableau sont :");
        for (int i = 0; i < N; i++) {
            System.out.println("Élément " + (i + 1) + " : " + T[i]);
        }

        scanner.close();
    }
}

