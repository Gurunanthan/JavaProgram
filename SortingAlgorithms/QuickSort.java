package SortingAlgorithms;


public class QuickSort {
    public static  void QuickSortingFunction(int arr[],int low,int high)
    {
        if(low>=high)return;
        int pivot = arr[high];
        int left = low;
        int right = high;
        
        while(left<right)
        {
            while(arr[left]<=pivot && left<right)
            {
                left++;
            }
            while(arr[right]>=pivot && left<right)
            {
                right--;
            }
            swap(arr,left,right);
        }
        swap(arr,left,high);
        QuickSortingFunction(arr, low, left-1);
        QuickSortingFunction(arr, left+1, high);

    }
    public static void swap(int arr[],int left,int right)
    {
        int temp = arr[left];
         arr[left] = arr[right];
         arr[right] = temp;
    }
    
}
