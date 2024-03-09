package tp1;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le rayon du cercle : ");
        double rayon = scanner.nextDouble();

        scanner.close();

        // Calculs
        double pi = 3.14;
        double surface = pi * rayon * rayon;
        double perimetre = 2 * pi * rayon;

        // Affichage des résultats
        System.out.println("La surface du cercle est : " + surface);
        System.out.println("Le périmètre du cercle est : " + perimetre);
    }
}

