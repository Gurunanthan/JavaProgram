package leetcode;

public class GCDvirtusaWithTwist {
    public static int gcd(int a, int b) {
        if (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = {1, 10, 11, 8, 12, 7, 9, 18};
        int max = arr[0]; 

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            arr[i]=(gcd(arr[i], max));
        }
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
