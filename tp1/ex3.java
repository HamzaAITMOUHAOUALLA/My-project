package tp1;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        int a = scanner.nextInt();

        System.out.print("Entrez la valeur de b : ");
        int b = scanner.nextInt();

        scanner.close();

        // Permutation avec une variable temporaire
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Après la permutation : a = " + a + " et b = " + b);
    }
}
