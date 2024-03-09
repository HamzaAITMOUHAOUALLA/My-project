package tp1_2;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le poids (en kg)
        System.out.print("Entrez le poids (en kg) : ");
        double poids = scanner.nextDouble();

        // Demander à l'utilisateur de saisir la taille (en mètres)
        System.out.print("Entrez la taille (en mètres) : ");
        double taille = scanner.nextDouble();

        // Demander à l'utilisateur de saisir le sexe (Femme ou Homme)
        System.out.print("Entrez le sexe (Femme ou Homme) : ");
        String sexe = scanner.next();

        // Calculer l'IMC
        double imc = poids / (taille * taille);

        // Afficher l'IMC
        System.out.println("L'IMC est de : " + imc);

        // Afficher l'état de poids en fonction du sexe
        if (sexe.equalsIgnoreCase("Femme")) {
            afficherEtatPoidsFemme(imc);
        } else if (sexe.equalsIgnoreCase("Homme")) {
            afficherEtatPoidsHomme(imc);
        } else {
            System.out.println("Sexe non reconnu. Veuillez entrer Femme ou Homme.");
        }

        scanner.close();
    }

    public static void afficherEtatPoidsFemme(double imc) {
        if (imc < 19) {
            System.out.println("Maigreur");
        } else if (imc >= 19 && imc <= 24) {
            System.out.println("Poids normal");
        } else if (imc > 24 && imc <= 30) {
            System.out.println("Surcharge pondérale");
        } else {
            System.out.println("Adiposité");
        }
    }

    public static void afficherEtatPoidsHomme(double imc) {
        if (imc < 20) {
            System.out.println("Maigreur");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Poids normal");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Surcharge pondérale");
        } else {
            System.out.println("Adiposité");
        }
    }
}

