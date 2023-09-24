package leetcode;

public class factorialUsingRecursion {
    public static int recursiveFactorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        int s=n*recursiveFactorial(--n);
        
        return s;
    }
    public static void main(String args[])
    {
        System.out.println(recursiveFactorial(5));
    }
}
