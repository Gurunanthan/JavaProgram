package Normal;
import java.util.Scanner;
public class threeplus1 {
    public static int threeplusone(int n)
    {
        int temp=n;
        System.out.println("the series for the number"+n+"\n");
        while(temp!=1)
        {
            if(temp%2==0)
            {
                temp/=2;

            }
            else{
                temp=(3*temp)+1;
            }
            System.out.print(temp+" ");
        }
        System.out.println("\n");
        return 0;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();
        // threeplusone(choice);
        for ( int i = 1; i <= 10000; i++) {
            threeplusone(i);
        }
    }
}
