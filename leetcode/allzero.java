package leetcode;

import java.util.*;

public class allzero {
    public static int[] allzeros(int[] arr) {
        int zeroPointer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[zeroPointer];
                arr[zeroPointer] = temp;
                zeroPointer++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0 };
        System.out.println(Arrays.toString(allzeros(arr)));
    }
}
