package leetcode;

import java.util.Arrays;

public class rotaionCountInTheSortedArray {
    public static int CountOfRotation(int arr[])
    {
        
        int minValue = Arrays.stream(arr).min().getAsInt();
        return Arrays.binarySearch(arr, minValue);
    }
    public static void main(String args[])
    {
        int arr[] = {14,15, 18, 2, 3, 6, 12};
        System.out.println(CountOfRotation(arr));
    }
}
