package Normal;
import java.util.Scanner;

public class Prime {
    public static void main (String[] args)
    {
        int prime ;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number to be checked");
            prime = sc.nextInt();
        }
        int c=0;
        for (int i = 2; i < prime; i++) {
            if(prime%i==0)
            {
                c++;
            }
            else{
                break;
            }
        }
        if(c==0){
            System.out.println("it is a prime");

        }
        else{
            System.out.println("its not a prime");
        }
    }
}
