package tp1_2;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclarer un tableau de 22 éléments pour les buts
        int[] butsParJoueur = new int[22];

        // Saisir le nombre de buts inscrits par chaque joueur
        for (int i = 0; i < 22; i++) {
            System.out.print("Entrez le nombre de buts pour le joueur " + (i + 1) + " : ");
            butsParJoueur[i] = scanner.nextInt();
        }

        // Afficher le numéro du buteur de l'équipe
        int numeroButeur = 0;
        int totalButs = 0;
        int joueursSansButs = 0;

        for (int i = 0; i < 22; i++) {
            totalButs += butsParJoueur[i];
            if (butsParJoueur[i] > 0) {
                numeroButeur = i + 1;
            } else {
                joueursSansButs++;
            }
        }

        System.out.println("Le numéro du buteur de l'équipe est le joueur " + numeroButeur);
        System.out.println("Le nombre total de buts inscrits par l'équipe est : " + totalButs);
        System.out.println("Le nombre de joueurs qui n'ont pas marqué de buts est : " + joueursSansButs);

        // Mettre à jour le nombre de buts pour le joueur n°9
        butsParJoueur[8] += 2;

        scanner.close();
    }
}
