package tp3;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille N
        int N;
        do {
            System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
            N = scanner.nextInt();
        } while (N < 10 || N > 50);

        // Déclarer un tableau 1D de taille N
        int[] T = new int[N];

        // Remplir le tableau avec les valeurs saisies par l'utilisateur
        for (int i = 0; i < N; i++) {
            System.out.print("Entrez la valeur pour l'élément " + (i + 1) + " : ");
            T[i] = scanner.nextInt();
        }

        // Effacer les occurrences de 5 et tasser les éléments restants
        int newSize = 0;
        for (int i = 0; i < N; i++) {
            if (T[i] != 5) {
                T[newSize] = T[i];
                newSize++;
            }
        }

        // Afficher le tableau résultant
        System.out.println("Le tableau résultant est :");
        for (int i = 0; i < newSize; i++) {
            System.out.print(T[i] + " ");
        }

        scanner.close();
    }
}
