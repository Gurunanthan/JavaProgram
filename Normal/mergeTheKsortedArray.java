package Normal;
import java.util.*;
public class mergeTheKsortedArray {
    public static void main(String args[])
    {
        int arr[][]={{5,1,2,3,4},{8,6,7,4,8}};
        for(int i=0;i<arr.length;i++)
        {
            Arrays.sort(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println("");
        }

    }
}
