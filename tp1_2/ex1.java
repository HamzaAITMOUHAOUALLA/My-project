package tp1_2;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un entier positif
        System.out.print("Entrez un entier positif : ");
        int nombre = scanner.nextInt();

        // Afficher les diviseurs du nombre
        System.out.print("Les diviseurs de " + nombre + " sont : ");
        int nombreDiviseurs = 0;
        int sommeDiviseurs = 0;

        for (int i = 1; i <= nombre; i++) {
            if (nombre % i == 0) {
                System.out.print(i + " ");
                nombreDiviseurs++;
                sommeDiviseurs += i;
            }
        }

        System.out.println("\nNombre de diviseurs : " + nombreDiviseurs);
        System.out.println("Somme des diviseurs : " + sommeDiviseurs);

        scanner.close();
    }
}
