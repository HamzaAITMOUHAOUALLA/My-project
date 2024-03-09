package tp2;
import java.util.Scanner;

public class ex6a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();
        scanner.close();

        boolean estPremier = true;

        if (nombre <= 1) {
            estPremier = false;
        } else {
            for (int i = 2; i <= Math.sqrt(nombre); i++) {
                if (nombre % i == 0) {
                    estPremier = false;
                    break;
                }
            }
        }

        if (estPremier) {
            System.out.println(nombre + " est un nombre premier.");
        } else {
            System.out.println(nombre + " n'est pas un nombre premier.");
        }
    }
}

