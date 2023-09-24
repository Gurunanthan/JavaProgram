package leetcode;

import java.util.*;

public class SplitTheArrayIntoNsegments {
    public static void splitter(int arr[], int Segments) {
        ArrayList<int[]> mainArray = new ArrayList<>();
        int middle = arr.length / Segments;
        int startIndex = 0;
        for (int k = 0; k < Segments; k++) {
            int subarr[] = new int[middle];
            for (int i = startIndex, j = 0; j < middle && i < arr.length; i++, j++) {
                subarr[j] = arr[i];
            }
            mainArray.add(subarr);
            startIndex += middle;
        }

        for (int[] subarr : mainArray) {
            System.out.println(Arrays.toString(subarr));
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        splitter(arr, 8);
    }
}
