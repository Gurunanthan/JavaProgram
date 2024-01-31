package Recursion;

import java.util.Scanner;

public class addingElementsTotheArray {
    public static int[] inputs(int arr[],int pos)
    {
        Scanner sc = new Scanner(System.in);
        if(arr.length==pos) return arr;
        arr[pos] = sc.nextInt();
        inputs(arr, ++pos);
        return arr;
    }
    public static void main(String[] args) {
        int arr [] = new int[10];
        int returned [] = inputs(arr, 0);
        for (int i : returned) {
            System.out.println(i);
        }
    }

}
