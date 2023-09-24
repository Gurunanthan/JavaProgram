package Normal;
import java .util.Scanner;
public class checktheprimenumber {
    public static void primt()
    {   try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number to check whether it is prime or not");
        int input = sc.nextInt();
        int prime=0;
        int i=0;
        for (i = 2; i < input; i++) 
        {
            if(input%i==0)
            {
                prime=1;
                break;
            }
        }
        if(prime==0)
        {
            System.out.println("it is a prime number");
        }
        else{
            System.out.println("it is not a prime number");
        }
    }
    }
    public static void main(String[] args)
    {
        primt();
    }
}
