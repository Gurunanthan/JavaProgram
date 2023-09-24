package leetcode;

import java.util.*;

public class MergeSort {
    public static int[] mergeSort(int[] unsortedArr) {
        int n = unsortedArr.length;
        if (n <= 1) {
            return unsortedArr;
        }
        int middle = n / 2;
        int[] left = Arrays.copyOfRange(unsortedArr, 0, middle);
        int[] right = Arrays.copyOfRange(unsortedArr, middle, n);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int leftLen = left.length;
        int rightLen = right.length;
        int[] result = new int[leftLen + rightLen];
        int i = 0, j = 0, k = 0;
        while (i < leftLen && j < rightLen) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < leftLen) {
            result[k++] = left[i++];
        }
        while (j < rightLen) {
            result[k++] = right[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] unsortedArray = { 1, 5, 3, 7, 8, 9, 10, 2555, 4, 8, 6, 8, 7, 4, 5, 6, 3, 2, 0, 1, 2, 8, 7, 1, 2, 33, 44,
                55, 66, 77, 5, 5, 528885, 858, 585, 8, 858, 58, 58, 58, 58, 585, 85, 85, 85, 858, 58, 58, 58, 585, 85,
                85, 82, 52, 58, 5, 95, 29852, 852, 92, 852, 28, 28, 2, 88, 418, 18, 184, 184, 484, 84, 48, 80, 58, 84,
                11, 80, 80, 85, 85, 858, 58, 58, 52, 85, 51, 1, 528, 488, 298, 65, 95, 95, 959, 59, 8498, 49, 4684, 698,
                498, 4651, 549, 846, 549, 8496, 594, 61, 64, 94, 61, 649, 816, 5168, 49, 46, 5198, 46, 5184, 51, 64,
                9684, 65, 6841, 6, 984, 651, 654, 894, 651 };
        int[] sortedArray = mergeSort(unsortedArray);
        System.out.print("Sorted Array:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
