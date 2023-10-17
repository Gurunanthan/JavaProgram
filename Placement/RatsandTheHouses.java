package Placement;

import java.util.*;

public class RatsandTheHouses {
    public static int rathouse(int r, int unit, int arr[], int n) {
        int sum = 0;
        int find = r * unit;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum >= find) {
                return i + 1;
            }
        }
        if (n == 0 || sum==0) return -1;

        return 0;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            int unit = sc.nextInt();
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(rathouse(r, unit, arr,n));
        }
    }
}
