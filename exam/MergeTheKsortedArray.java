package exam;
import java.util.Arrays;
public class MergeTheKsortedArray {
    public static int[] Arrays(int karr[][])
    {
        int sortedarray[]=new int[karr.length*karr[0].length]; 
        for (int i = 0; i < karr.length; i++) {
            Arrays.sort(karr[i]);
        }
        int increament=0;
        for (int i = 0; i < karr.length; i++) {
            for (int j = 0; j < karr[0].length; j++){

                sortedarray[increament]=karr[i][j];
                increament++;
            }
        }
        
        return sortedarray;

    }
    public static void main(String args[])
    {
        int arr[][] = {{1, 3, 5, 7},{9,2, 4,8}};
        int sortedarray[]=Arrays(arr);
        for (int i = 0; i < sortedarray.length; i++) {
            System.out.println(sortedarray[i]);
        }

    }
}
