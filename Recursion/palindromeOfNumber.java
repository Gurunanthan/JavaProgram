package Recursion;
// please check it cause it fails some test cases

public class palindromeOfNumber {
    public static boolean isPalindrome(int n) {
        if (n / (int) Math.pow(10, (int) Math.log10(n)) != n % 10) {
            return false;
        } else if (n < 10) {
            return true;
        }
        return isPalindrome(n % (int) Math.pow(10, (int) Math.log10(n)) / 10);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));  // true
    }
}
