package Normal;
import java.util.Scanner;
public class twodimarray {
    public static void array(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {//column
                System.out.print(arr[i][j]);
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

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================================================\n Commander Should we initiate the Process\n");
        System.out.println("YES/NO");
        String init = sc.next();

        if(init=="y")
        {
            getinput();
        }
        else{
            System.out.println("THE MISSION IS ABORTED SUCCESSFULLY....");
        }
    }
}
