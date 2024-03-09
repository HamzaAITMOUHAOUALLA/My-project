package tp1;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a,b,s,p;
        String nam;
        System.out.println("enrer votre nam ");
        nam = Sc.nextLine();
        System.out.println("entre deux entiers");
         a= Sc.nextInt();
         b= Sc.nextInt();

         s=a+b;
         p=a*b;
        System.out.println(nam+"la somme est "+s+" le preduit est \n"+p);
    }
}
