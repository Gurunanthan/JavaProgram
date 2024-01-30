package Recursion;
import java.util.*;
class recursion {
    public static int fibo(int n)
    {
        if(n<2)
        {
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(fibo(sc.nextInt()));
        sc.close();
    }

}