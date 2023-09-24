package Normal;
import java.util.Scanner;

public abstract class printNnumberdigits {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int howmanydigits=sc.nextInt();
        for (int i = 0; i < 100; i++) {
            String str = String.valueOf(i);
            while(str.length()!=howmanydigits)
            {
                str='0'+str;
            }
            System.out.println(str);
        }
    }
}
