package Recursion;
public class BinarySearch {
    public static int search(int high,int low,int arr[],int find)
    {
        int mid = (high+low)/2;
        if(arr[mid]>find)search(high,mid+1,arr,find);
        else if (arr[mid]<find)search(mid-1,low,arr,find);
        return mid;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int find=5;
        System.out.println(search(0,arr.length-1,arr,find));
    }
}
