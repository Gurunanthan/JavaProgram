package SortingAlgorithms;

public class BubbleSort {
    public void BubbleSortingFunction(int arr[]) {
        PrintingFunction printingFunction = new PrintingFunction();
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
        
        printingFunction.Printer(arr);
    }
}
