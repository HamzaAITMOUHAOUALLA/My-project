package tp3;
import java.util.Scanner;

public class ex5 {
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

        // Inverser l'ordre des éléments du tableau
        for (int i = 0; i < N / 2; i++) {
            int temp = T[i];
            T[i] = T[N - 1 - i];
            T[N - 1 - i] = temp;
        }

        // Afficher le tableau résultant
        System.out.println("Le tableau inversé est :");
        for (int i = 0; i < N; i++) {
            System.out.print(T[i] + " ");
        }

        scanner.close();
    }
}

