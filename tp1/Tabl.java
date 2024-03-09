package tp1;
import java.util.Scanner;
public class Tabl {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int t[] = new int[4];
        int i;

        for ( i=0;i<4;i++){
       t[i] = i;
        }

        for ( i=t.length-1;i>0;i--){
            System.out.print(t[i]+" ");
        }
    }
}
