package Normal;
import java.util.Scanner;

public class bubblesort {
    public static void bubble(int arr[])
    {
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("the sorted value is"+arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENTER THE SIZE OF THE ARRAY");
            int size = sc.nextInt();    
            int arr[]=new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
            }
            bubble(arr);
        }
    }
}
