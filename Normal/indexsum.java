package Normal;
import java.util.Scanner;

public class indexsum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = sc.nextInt();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 1; i<arr.length;i++)
        {
            if(arr[i]+arr[i-1]==input)
            {
                System.out.println("the number to be added are in the index of "+arr[i-1]+" and in  "+arr[i]);
                continue;
            }
            

        }
    }
    
}
