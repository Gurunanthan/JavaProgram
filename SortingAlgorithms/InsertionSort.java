package SortingAlgorithms;
public class InsertionSort {
    public void InsertionSortingFunction(int arr[])
    {
        PrintingFunction p = new PrintingFunction();
        for(int i=0;i<arr.length-1;i++)
        {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        p.Printer(arr);

    }
}


// for i from 0 to length of arr - 2 do
//     minIndex = i
//     for j from i + 1 to length of arr - 1 do
//         if arr[j] < arr[minIndex] then
//             minIndex = j
//         end if
//     end for
    
//     // Swap arr[i] with the minimum element found in the unsorted portion
//     temp = arr[minIndex]
//     arr[minIndex] = arr[i]
//     arr[i] = temp
// end for

