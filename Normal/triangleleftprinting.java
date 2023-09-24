package Normal;
import java.util.Scanner;

public class triangleleftprinting {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        for (int j = i-1; j >-1; j--) {
            for (int j2 = j; j2 >=0; j2--) {
                if()
                System.out.print((char)(j+65));
            }
            System.out.println();
        }
    }
}
