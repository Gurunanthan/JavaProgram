package Recursion;
import java.util.Scanner;
public class palindromeUsingRecursion {
    public static boolean isPalindrome(String word) {
        if (word.length() < 2)
            return true;
        if (word.charAt(0) == word.charAt(word.length() - 1))
            return isPalindrome(word.substring(1, word.length() - 1));
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.nextLine();
        if (isPalindrome(inputWord.toLowerCase())) {
            System.out.println(inputWord + " is a palindrome.");
        } else {
            System.out.println(inputWord + " is not a palindrome.");
        }
        sc.close();
    }
}
