package tp2;
import java.util.Scanner;

public class ex1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'entiers (N) : ");
        int N = scanner.nextInt();

        int somme = 0;
        int produit = 1;

        for (int i = 0; i < N; i++) {
            System.out.print("Entrez un entier : ");
            int entier = scanner.nextInt();

            somme += entier;
            produit *= entier;
        }

        scanner.close();

        double moyenne = (double) somme / N;

        System.out.println("Somme des entiers : " + somme);
        System.out.println("Produit des entiers : " + produit);
        System.out.println("Moyenne des entiers : " + moyenne);
    }
}
