package tp1_2;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir deux entiers
        System.out.print("Entrez le premier entier (n) : ");
        int n = scanner.nextInt();

        System.out.print("Entrez le deuxième entier (m) : ");
        int m = scanner.nextInt();

        // Vérifier s'ils sont amis
        if (sontAmis(n, m)) {
            System.out.println(n + " et " + m + " sont des nombres amis.");
        } else {
            System.out.println(n + " et " + m + " ne sont pas des nombres amis.");
        }

        scanner.close();
    }

    public static boolean sontAmis(int n, int m) {
        return (sommeDiviseurs(n) == m) && (sommeDiviseurs(m) == n);
    }

    public static int sommeDiviseurs(int nombre) {
        int somme = 0;
        for (int i = 1; i < nombre; i++) {
            if (nombre % i == 0) {
                somme += i;
            }
        }
        return somme;
    }
}
