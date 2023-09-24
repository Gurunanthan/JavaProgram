package Normal;
import java.util.Scanner;

public class pascaltriangle {
    public static int factorial(int n)
    {
        int value=1;
        if(n==1)
        {
            return 1;
        }
        for (int i = 2; i <=n; i++) {
            value*=i;
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=i; j++) {
                   System.out.print(" "+factorial(i)/(factorial(j)*factorial(i-j)));
    
            }
            System.out.println("\n");
        }
    }
    
}