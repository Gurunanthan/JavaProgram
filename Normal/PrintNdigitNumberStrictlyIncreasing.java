package Normal;
import java.util.Scanner;

public class PrintNdigitNumberStrictlyIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        
        // Calculate the number of digits needed to represent the length
        int numDigits = String.valueOf(length).length();

        for (int i = 1; i <= length; i++) {
            // Format the number with leading zeros based on the number of digits
            String formattedNumber = String.format("%0" + numDigits + "d", i);
            System.out.println(formattedNumber);
        }
    }
}
