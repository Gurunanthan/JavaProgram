package Recursion;

public class lengthOfaString {
    public static int length(String s) {
        if (s.equals("")) {
            return 0;
        } else {
            return 1 + length(s.substring(1));
        }

    }

    public static void main(String[] args) {
        System.out.println(length("hello world"));
    }
}
