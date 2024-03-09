package tp2;
import java.util.Scanner;

public class ex1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'entiers (N) : ");
        int N = scanner.nextInt();

        int somme = 0;
        int produit = 1;
        int compteur = 0;

        while (compteur < N) {
            System.out.print("Entrez un entier : ");
            int entier = scanner.nextInt();

            somme += entier;
            produit *= entier;
            compteur++;
        }

        scanner.close();

        double moyenne = (double) somme / N;

        System.out.println("Somme des entiers : " + somme);
        System.out.println("Produit des entiers : " + produit);
        System.out.println("Moyenne des entiers : " + moyenne);
    }
}
