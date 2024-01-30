package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSortFunction(int[] arr) {
        int size = arr.length;

        if (size < 2) {
            return arr;
        }

        int midIndex = size / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[size - midIndex];
        int pointer = 0;

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = arr[pointer++];
        }

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = arr[pointer++];
        }

        return merge(mergeSortFunction(leftArray), mergeSortFunction(rightArray));
    }

    public static int[] merge(int leftArray[], int rightArray[]) {
        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;
        int combinedArray[] = new int[leftArraySize + rightArraySize];
        int leftPointer = 0;
        int rightPointer = 0;
        int combinedPointer = 0;

        for (; leftPointer < leftArraySize && rightPointer < rightArraySize; combinedPointer++) {
            if (leftArray[leftPointer] < rightArray[rightPointer]) {
                combinedArray[combinedPointer] = leftArray[leftPointer++];
            } else {
                combinedArray[combinedPointer] = rightArray[rightPointer++];
            }
        }

        for (; leftPointer < leftArraySize; leftPointer++, combinedPointer++) {
            combinedArray[combinedPointer] = leftArray[leftPointer];
        }

        for (; rightPointer < rightArraySize; rightPointer++, combinedPointer++) {
            combinedArray[combinedPointer] = rightArray[rightPointer];
        }

        return combinedArray;
    }

}
