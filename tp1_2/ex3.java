package tp1_2;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un entier positif
        System.out.print("Entrez un entier positif supérieur à 1 : ");
        int n = scanner.nextInt();

        // Vérifier si le nombre est parfait
        if (estParfait(n)) {
            System.out.println(n + " est un nombre parfait.");
        } else {
            System.out.println(n + " n'est pas un nombre parfait.");
        }

        scanner.close();
    }

    public static boolean estParfait(int nombre) {
        int sommeDiviseurs = 0;
        for (int i = 1; i < nombre; i++) {
            if (nombre % i == 0) {
                sommeDiviseurs += i;
            }
        }
        return sommeDiviseurs == nombre;
    }
}

