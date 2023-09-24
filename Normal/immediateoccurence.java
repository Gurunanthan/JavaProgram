package Normal;
import java.util.Scanner;

public class immediateoccurence {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n+2];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(temp==arr[j])
                {
                    System.out.print(arr[i]);
                }
            }
        }
    }
}
