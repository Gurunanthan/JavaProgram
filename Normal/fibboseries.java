package Normal;
import java.util.Scanner;

public class fibboseries {
    public static void main(String[] args){
        int fibbo = 0;
        int secondfibbo = 1;
        int temp =0;
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            System.out.print(" The fibbo series ");
            System.out.print(fibbo);
            for (int i = 0; i < n; i++) {
                temp=fibbo+secondfibbo;
                secondfibbo=fibbo;
                fibbo=temp;
                System.out.print(" "+fibbo+" ");
            }
        }
        System.out.println("");
    }
}
