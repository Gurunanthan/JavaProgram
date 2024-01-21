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


// pseudocode

// for i from 0 to length of arr - 2 do
//     for j from 0 to length of arr - 2 do
//         if arr[j] > arr[j + 1] then
//             // Swap arr[j] and arr[j + 1]
//             arr[j] = arr[j] XOR arr[j + 1]
//             arr[j + 1] = arr[j] XOR arr[j + 1]
//             arr[j] = arr[j] XOR arr[j + 1]
//         end if
//     end for
// end for
