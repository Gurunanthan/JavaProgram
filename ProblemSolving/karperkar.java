import java.util.Scanner;
public class karperkar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isKaprekar(number)) {
            System.out.println(number + " is a Kaprekar number.");
        } else {
            System.out.println(number + " is not a Kaprekar number.");
        }
    }
    public static boolean isKaprekar(int num) {
        long square = (long) num * num; 
        int numDigits = (int) Math.log10(square) + 1; 

        for (int i = 1; i < numDigits; i++) {
            long divisor = (long) Math.pow(10, i);
            long rightPart = square % divisor;
            long leftPart = square / divisor;

            if (rightPart > 0 && leftPart > 0 && rightPart + leftPart == num) {
                return true;
            }
        }
        return false;
    }
}
