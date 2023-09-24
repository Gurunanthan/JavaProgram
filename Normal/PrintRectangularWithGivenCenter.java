package Normal;

import java.util.Scanner;

public class PrintRectangularWithGivenCenter {
    static void RectangularPattern(int c1, int c2, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((Math.max(Math.abs(c1 - i),Math.abs(c2 - j))) + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int n = sc.nextInt();
        RectangularPattern(c1, c2, n);
    }
}
