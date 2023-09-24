package Normal;
import java.util.Scanner;
public class sumofrows {
    public static void array(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {//column
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
    public static void getinput()
    {
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
        array(arr);
        sumofrows(arr);

    }
    public static void sumofrows(int arr[][]){
        int thegreatest =0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j <=arr.length; j++) {
                sum+=arr[i][j];
            }    
            if(thegreatest<sum)
            {
                thegreatest=sum;

            }
        }
        System.out.println("sum of  is "+thegreatest);
    }
    public static void main(String[] args) {
        getinput();

}
}