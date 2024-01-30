package leetcode;
// import java.util.*;

public class SeatingArrangementsInTheNearestGap {
    public static int seating(String arr[], String seat) {
        int pos = 0;
        int res = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(seat)) {
                pos = i;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("-")) {
                int pointer = Math.abs(pos - i);
                res = Math.min(pointer, res);
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        String arr[] = {"-", "2FG", "4YG", "-", "3TE", "2AB"};
        System.out.println(seating(arr, "2AB"));
    }
}
