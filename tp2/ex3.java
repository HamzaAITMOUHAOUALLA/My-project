package tp2;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un entier N : ");
        int N = scanner.nextInt();

        scanner.close();

        double somme = 0.0;

        for (int i = 1; i <= N; i++) {
            somme += 1.0 / i;
        }

        System.out.println("La somme des " + N + " premiers termes de la série harmonique est : " + somme);
    }
}

