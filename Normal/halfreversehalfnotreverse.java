package Normal;
import java.util.Scanner;
public class halfreversehalfnotreverse {

    public static void main(String [] args) {
        System.out.println("Enter the element ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i =input;i>=0; i--) {
            System.out.print(arr[i]);
        }
        for (int i = input+1; i < arr.length-1; i++) {
            System.out.print(arr[i]);
        }
        
    }
}