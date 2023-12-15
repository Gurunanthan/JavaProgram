package leetcode;

public class TwoArraysWithoutSortingMerge {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {6, 5, 4}};
        int fullarr[] = new int[arr.length * arr[0].length];
        int helper = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                fullarr[helper++] = arr[i][j];
            }
        }

        for (int i = 0; i < fullarr.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < fullarr.length; j++) {
                if (fullarr[j] < fullarr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = fullarr[minIndex];
            fullarr[minIndex] = fullarr[i];
            fullarr[i] = temp;
        }

        for (int i : fullarr) {
            System.out.println(i);
        }
    }
}




