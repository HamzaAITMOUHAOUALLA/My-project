package tp3;
import java.util.Scanner;

public class ex6 {
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

        // Créer les tableaux TP et TN
        int[] TP = new int[N];
        int[] TN = new int[N];
        int tpIndex = 0;
        int tnIndex = 0;

        // Copier les éléments positifs dans TP et les négatifs dans TN
        for (int i = 0; i < N; i++) {
            if (T[i] > 0) {
                TP[tpIndex++] = T[i];
            } else if (T[i] < 0) {
                TN[tnIndex++] = T[i];
            }
        }

        // Afficher les tableaux TP et TN
        System.out.println("Tableau TP (positif) :");
        for (int i = 0; i < tpIndex; i++) {
            System.out.print(TP[i] + " ");
        }
        System.out.println();

        System.out.println("Tableau TN (négatif) :");
        for (int i = 0; i < tnIndex; i++) {
            System.out.print(TN[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}

