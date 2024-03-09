package tp1;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int n1 = scanner.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int n2 = scanner.nextInt();

        scanner.close();

        int pgcd = 0;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                pgcd = i;
        }

        System.out.printf("Le PGCD de %d et %d est : %d", n1, n2, pgcd);
    }
}
