package Normal;
import java.util.Scanner;

public class FibboSeriesUsingRecursion {
    public static int fibo(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else{

            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int range =sc.nextInt();
        for (int i = 0; i < range; i++) {
            System.out.println(fibo(i));
        }
    }
}
