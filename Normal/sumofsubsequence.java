package Normal;
import java.util.Scanner;

public class sumofsubsequence {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        for (int j = 0; j < arr.length; j++) {
            int thegreatestsum=0;
            for (int j2 = 0; j2 < j; j2++)
                    thegreatestsum+=arr[j2];
            
            System.out.println(thegreatestsum);
        }
    }
}
