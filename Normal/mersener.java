package Normal;
import java.util.Scanner;
import java.lang.*;
public class mersener {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int mersener[]=new int[element];
        for(int i = 1;i < element; i++)
        {
            mersener[i]=((int)(Math.pow(2, i)))-1;
        }
        for (int i = 1; i < element; i++) {
            System.out.println(mersener[i]);
        }
    }
}
