package SortingAlgorithms;

public class InsertionSort {
    public void InsertionSortFunction(int arr[]) {
        PrintingFunction pf = new PrintingFunction();

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j > -1; j--) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }

        pf.Printer(arr);
    }

}

// pseudocode
// for i from 1 to length of arr - 1 do
//     for j from i - 1 to 0 do
//         if arr[j] > arr[j + 1] then
//             // Swap arr[j] and arr[j + 1]
//             arr[j] = arr[j] XOR arr[j + 1]
//             arr[j + 1] = arr[j] XOR arr[j + 1]
//             arr[j] = arr[j] XOR arr[j + 1]
//         end if
//     end for
// end for

