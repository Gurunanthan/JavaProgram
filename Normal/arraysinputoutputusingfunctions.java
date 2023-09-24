package Normal;
import java.util.Scanner;
public class arraysinputoutputusingfunctions {
    public static int[] takeinput()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of the array\n");
            int sizeofthearr = sc.nextInt();
            int takeinput[] = new int[sizeofthearr];
            for(int i=0; i< takeinput.length; i++)
            {
                takeinput[i] = sc.nextInt();
            }
            return takeinput;
        }
    }
    public static void display(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("the "+ i + " index element is "+arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int result[]=takeinput();
        display(result);
    }

}
