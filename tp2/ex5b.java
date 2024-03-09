package tp2;
import java.util.Scanner;

public class ex5b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();
        scanner.close();

        long factorielle = 1;

        for (int i = 1; i <= nombre; i++) {
            factorielle *= i;
        }

        System.out.println("La factorielle de " + nombre + " est : " + factorielle);
    }
}

