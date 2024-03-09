package tp1;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int entier1 = scanner.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int entier2 = scanner.nextInt();

        scanner.close();

        // Calculs
        int somme = entier1 + entier2;
        int difference = entier1 - entier2;
        int produit = entier1 * entier2;
        double quotient = (double) entier1 / entier2;

        // Affichage des résultats
        System.out.println("La somme est : " + somme);
        System.out.println("La différence est : " + difference);
        System.out.println("Le produit est : " + produit);
        System.out.println("Le quotient est : " + quotient);
    }
}


