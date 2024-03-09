package tp1_2;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir l'heure
        System.out.print("Entrez l'heure (entre 0 et 23) : ");
        int heure = scanner.nextInt();

        // Demander à l'utilisateur de saisir les minutes
        System.out.print("Entrez les minutes (entre 0 et 59) : ");
        int minutes = scanner.nextInt();

        // Calculer l'heure une minute plus tard
        minutes += 1;
        if (minutes == 60) {
            minutes = 0;
            heure = (heure + 1) % 24;
        }

        // Afficher l'heure
        System.out.println("Dans une minute, il sera " + heure + " heure(s) " + minutes + " minute(s).");

        scanner.close();
    }
}
