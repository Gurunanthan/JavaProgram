package leetcode;

public class HowManyTimesTheArrayRotated {
    public static void main(String args[])
    {
        int arr[] = {3,2,4,5};
        int rotatedArr[] = {4,5,3,2};
        for(int i =arr.length-1;i>-1;i-- )
        {
            if(arr[0]==rotatedArr[i])
            {
                System.out.println(i);
            }
        }
    }
}
