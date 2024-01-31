package Recursion;

public class PrintSeriesOfANumber {
    public static void series(int n, int end) {
        if (n == end) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        series(++n, end);

    }

    public static void main(String[] args) {
        series(0, 50);
    }
}
