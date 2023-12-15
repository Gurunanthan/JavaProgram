package leetcode;

import java.util.*;

//zoho

public class FirstGreatestElementLastSmallestElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int number = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i % 2 == 0) {
                number = Integer.MIN_VALUE;
                for (int j = i; j < n; j++) {
                    number = Math.max(arr[j], number);
                }
            } else {
                number = Integer.MAX_VALUE;
                for (int j = i; j < n; j++) {
                    number = Math.min(arr[j], number);
                }
            }

            for (int j = i; j < n; j++) {
                if (arr[j] == number) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
