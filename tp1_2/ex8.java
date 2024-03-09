package tp1_2;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir l'âge
        System.out.print("Entrez l'âge : ");
        int age = scanner.nextInt();

        // Demander à l'utilisateur de saisir le sexe (H ou F)
        System.out.print("Entrez le sexe (H ou F) : ");
        char sexe = scanner.next().charAt(0);

        // Vérifier si l'habitant est imposable
        boolean imposable = false;

        if (sexe == 'H' && age > 20) {
            imposable = true;
        } else if (sexe == 'F' && age >= 18 && age <= 35) {
            imposable = true;
        }

        // Afficher le résultat
        if (imposable) {
            System.out.println("L'habitant est imposable.");
        } else {
            System.out.println("L'habitant n'est pas imposable.");
        }

        scanner.close();
    }
}

