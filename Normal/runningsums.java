package Normal;
import java.util.Scanner;
public class runningsums {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int arr[]={1,1,1,1};
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print((temp+=arr[i])+",");
        }
    }
}
