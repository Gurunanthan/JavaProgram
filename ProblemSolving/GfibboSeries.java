package ProblemSolving;

import java.util.*;

public class GfibboSeries {
    public static int findfibo(int a, int b, int c, int n, int m) {
        return ((n * n) % m);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(findfibo(a, b, c, n, m));
    }
}
