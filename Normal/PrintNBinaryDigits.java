package Normal;
import java.util.Scanner;

public class PrintNBinaryDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int howManyDigits = sc.nextInt();
        for (int i = 0; i < 100; i++) {
            String binary = Integer.toBinaryString(i);
            while (binary.length() < howManyDigits) {
                binary = '0' + binary;
            }
            System.out.println(binary);
        }
    }
}
