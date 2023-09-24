package Normal;
import java.util.Arrays;
public class mergeksortedarray{
    public static void main(String[] args)
    {
        int [][] arr={{1,3,5,7},{2,4,6,8},{0,9,10,11}};
        int k=arr.length;System.out.println(k);
        int n=arr[0].length;System.out.println(n);
        int arra[]=new int[k*n];int l=0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                arra[l++]=arr[i][j];
            }
        }
        Arrays.sort(arra);
        System.out.println(Arrays.toString(arra));
    }

}