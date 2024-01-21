package leetcode;
// total nums of rows is given so create that number of strings in an array
//["","",""]
// add every charachter to the corresponding string and join them all this is the solution


import java.util.Arrays;
import java.util.Scanner;

public class ZigZagConversion {
    public static void ZZ(String s, int numrows) {
        if (numrows == 0 || s.length() < numrows) {
            System.out.println(s);
            return;
        }

        int count = 0;
        boolean direction = false;
        String[] arr = new String[numrows];
        Arrays.fill(arr, "");

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            arr[count] += curr;

            if (count == 0 || count == numrows - 1) {
                direction = !direction;
            }

            count += direction ? 1 : -1;
        }
        String result = String.join("", arr);
        System.out.println(result);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
        }
        int rows = 3;
        String s = "paypalishiring";

        ZZ(s, rows);
    }
}
