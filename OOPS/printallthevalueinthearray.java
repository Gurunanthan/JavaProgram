import java.util.*;

public class printallthevalueinthearray {
    static int n = 10;
    static int arr[] = new int[n];

    public static void elementsGet() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Read an integer from the user
        }
    }

    public static void printElements() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        elementsGet();
        printElements();
    }
}
