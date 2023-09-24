package Normal;
import java.util.*;
public class transpose {
    static int temp=0;
    public static void transpose(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                {
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows Commander");
        int row = sc.nextInt();
        System.out.println("Enter the Number of Columns Commander");
        int column = sc.nextInt();
        int arr[][]=new int[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        transpose(arr);

    }
}
