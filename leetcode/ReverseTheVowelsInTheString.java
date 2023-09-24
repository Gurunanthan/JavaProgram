package leetcode;

public class ReverseTheVowelsInTheString {
    public static String reverseTheWord(String s) {
        int length = s.length();
        char charachterarray[] = s.toCharArray();
        int left = 0;
        int right = length - 1;
        while (left < right) {
            if (!checkVowel(charachterarray[left])) {
                left++;
            } else if (!checkVowel(charachterarray[right])) {
                right--;
            } else {
                char temp = charachterarray[left];
                charachterarray[left] = charachterarray[right];
                charachterarray[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(charachterarray);
    }

    public static boolean checkVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String s = reverseTheWord("Education");
        System.out.println(s);
    }

}
