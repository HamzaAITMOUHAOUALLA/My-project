package tp1;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        scanner.close();

        if (a == 0) {
            if (b == 0) {
                System.out.println("L'équation a*x + b = 0 a une infinité de solutions.");
            } else {
                System.out.println("L'équation a*x + b = 0 n'a pas de solution.");
            }
        } else {
            double x = -b / a;
            System.out.println("L'équation a*x + b = 0 a une solution unique :");
            System.out.println("x = " + x);
        }
    }
}
