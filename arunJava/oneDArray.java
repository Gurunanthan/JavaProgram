package arunJava;
import java.util.*;

public class oneDArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();

        }
        int max=arr[0];
        for(int i=1;i<5;i++)
        {
            max = Math.max(arr[i], max);
        }
        System.out.println(max);
    }
    
}
