package Recursion;

public class productOfDigits {
    public static int digitProduct(int n)
    {
        if(n%10==n)return n;
        return (n%10)*digitProduct(n/10);
    }
    public static void main(String[] args) {
        System.out.println(digitProduct(185964));
    }
}
