package leetcode;

public class BestTimeToBuyAndSellStock {
    public static int bttbass(int[] arr)
    {
        int total = 0;
        int diffrence=0;
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]>arr[i-1])
            {
                diffrence = arr[i]-arr[i-1];
                total+=diffrence;
            }
        }
        return total;
    }
    public static void main(String args[])
    {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(bttbass(arr));
    }
}
