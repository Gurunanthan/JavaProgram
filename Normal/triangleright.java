package Normal;
import java.util.Scanner;

public class triangleright {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int os=65;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <=rows; j++) {
                if(j>=rows-i)
                {
                    System.out.print((char)(rows-j+os));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
