package Normal;
import java.util.Scanner;

public class factorsofthenumber {
    public static void factor(int n)
    {
        int temp=0;
        for (int i = 1; i <n; i++) {
            if(n%i==0)
            {
                System.out.println("The Factor Of The Number Is "+i);
                temp+=i;
            } 
        } 
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int input =sc.nextInt();
        factor(input);
    }
}
