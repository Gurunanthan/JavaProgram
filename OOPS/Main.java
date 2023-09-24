// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();
//         String[] split = input.split(" ");
        
//         if (split.length != 2) {
//             System.out.println("Invalid input format. Please provide a valid roll number and number separated by space.");
//             return;
//         }
        
//         String rollno = split[0];
//         String number = split[1];
        
//         if (isValidRollNo(rollno) && isValidNumber(number)) {
//             System.out.println("Valid");
//         } else {
//             System.out.println("Invalid");
//         }
//     }
    
//     private static boolean isValidRollNo(String rollno) {
//         return rollno.matches("[0-9]{2}[A-Za-z]{3}[0-9]{4}");
//     }
    
//     private static boolean isValidNumber(String number) {
//         return number.matches("[0-9]{9}");
//     }
// }
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split(" ");
        
        if (split.length != 2) {
            System.out.println("Invalid input format. Please provide a valid roll number and number separated by space.");
            return;
        }
        
        String rollno = split[0];
        String number = split[1];
        
        if (isValidRollNo(rollno) && isValidNumber(number)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    
    private static boolean isValidRollNo(String rollno) {
        return rollno.matches("[0-9]{2}[A-Za-z]{3}[0-9]{4}");
    }
    
    private static boolean isValidNumber(String number) {
        return number.matches("[0-9]{9}");
    }
}
