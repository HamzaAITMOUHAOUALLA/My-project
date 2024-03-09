package tp3;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Étape 1 : Demander à l'utilisateur de saisir la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Étape 2 : Créer un tableau avec la taille entrée par l'utilisateur
        int[] tableau = new int[taille];

        // Étape 3 : Demander à l'utilisateur de remplir le tableau
        for (int i = 0; i < taille; i++) {
            System.out.print("Entrez l'élément " + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }

        // Étape 4 : Calculer la somme des éléments
        int somme = 0;
        for (int element : tableau) {
            somme += element;
        }

        // Étape 5 : Calculer la moyenne des éléments
        double moyenne = (double) somme / taille;

        // Étape 6 : Copier le tableau dans un deuxième tableau T2 et l'afficher
        int[] T2 = new int[taille];
        for (int i = 0; i < taille; i++) {
            T2[i] = tableau[i];
        }

        System.out.println("Le tableau T2 est :");
        for (int element : T2) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Étape 7 : Classer les éléments du tableau dans un ordre croissant
        java.util.Arrays.sort(tableau);

        System.out.println("Le tableau trié est :");
        for (int element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();

        scanner.close();
    }
}
