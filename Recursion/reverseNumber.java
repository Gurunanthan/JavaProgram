package Recursion;

public class reverseNumber {
    static int sum = 0;

    public static int reverse(int n) {
        if (n % 10 == n || n / 10 == 0) {
            sum = sum * 10 + n % 10;
            return sum;
        }
        sum = sum * 10 + n % 10;
        return reverse(n / 10);
    }

    // public static int reverse(int n) {
    //     if (n < 10) {
    //         return n;
    //     }
    //     return (n % 10) * (int)Math.pow(10, (int)Math.log10(n)) + reverse(n / 10);
    // }

    public static void main(String[] args) {
        System.out.println(reverse(15151));
    }
}
