package SortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[100000];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100000000);
        }
        // SelectionSort sSort = new SelectionSort();
        // BubbleSort bSort = new BubbleSort();
        // InsertionSort iSort = new InsertionSort();
        // MergeSort mSort = new MergeSort();
        // QuickSort qSort = new QuickSort();

        // Uncomment the sorting algorithm function you want to use
        // sSort.SelectionSortingFunction(arr);
        // bSort.BubbleSortingFunction(arr);
        // iSort.InsertionSortFunction(arr);
        int result[] = MergeSort.mergeSortFunction(arr);
        // qSort.QuickSortingFunction(arr, 0, arr.length - 1);
        
        System.out.println("Sorted Array: " + Arrays.toString(result));
    }
}
