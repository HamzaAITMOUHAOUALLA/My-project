package tp1;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        System.out.print("Entrez la valeur de c : ");
        double c = scanner.nextDouble();

        scanner.close();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("L'équation a*x² + b*x + c = 0 a deux solutions réelles distinctes :");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("L'équation a*x² + b*x + c = 0 a une solution réelle unique :");
            System.out.println("x = " + x);
        } else {
            System.out.println("L'équation a*x² + b*x + c = 0 n'a pas de solution réelle.");
        }
    }
}
