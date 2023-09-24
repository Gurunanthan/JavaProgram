package Normal;
import java.util.Scanner;
public class oddorevenusingboolean {
    public static boolean oddeven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the number to check whether the given number is odd or even");
            int number = sc.nextInt();
            boolean result = oddeven(number);
            if(result)
            {
                System.out.println("the given number is even");
            }
            else{
                System.out.println("the given number is odd");
            }
        }
    }
}
