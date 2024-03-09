package tp2;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
      Scanner Sc= new Scanner(System.in);
      int s=0;
      float p=1,m=0;
        System.out.println("entrer le nbres des entiers: ");
        int n = Sc.nextInt();
        System.out.println("entrer les "+n );
        for (int i = 0; i<n; i++){
            System.out.println("l entier numero "+(i+1));
          int nb=Sc.nextInt();
          s+=nb;
          p*=nb;
        }
      m= s / n;



        System.out.println("la somme est"+s+"le produit est "+p+"la moyenne est "+m);
    }
}
