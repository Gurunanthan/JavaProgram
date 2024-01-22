package SortingAlgorithms;

public class MergeSort {
    public int[] divide(int []arr)
    {
        int size = arr.length;
        int midIndex = size/2;
        int leftArray[] = new int[midIndex];
        int rightArray[] = new int[size-midIndex];
        int pointer =0;
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i]=arr[pointer++];
        }   

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i]=arr[pointer++];
        }
        return merge(divide(leftArray),divide(rightArray));
    }
    public int[] merge(int leftArray[],int rightArray[])
    {
        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;
        int combinedArray[] = new int[leftArraySize+rightArraySize];
        return combinedArray;

    }
}
