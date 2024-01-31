package Recursion;

public class sumOfDigits {
    public static int digitSum(int n)
    {
        if(n==0) return 0;
        int digint = n%10;
        return digint+ digitSum(n/10);
    }
    public static void main(String[] args) {
        int s = 78;
        System.out.println(digitSum(s));
    }

}
