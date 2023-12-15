package leetcode;

import java.util.Scanner;

public class ReverseTheWordButMaintainTheSpaces {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String s = "i ate an apple";
        int counter = 0;
        char[] spacesRemoveChar = new char[s.length() - (s.split(" ").length - 1)];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                spacesRemoveChar[counter] = s.charAt(i);
                counter++;
            }
        }

        for (char c : spacesRemoveChar) {
            System.out.println(c);
        }

        counter = spacesRemoveChar.length - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                System.out.print(spacesRemoveChar[counter]);
                counter--;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
