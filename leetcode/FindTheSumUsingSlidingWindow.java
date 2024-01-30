package leetcode;
public class FindTheSumUsingSlidingWindow {
    public static void SlidingWindow(int find, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        if (arr.length <= 1)
            return;
        while (left < right) {
            int sum = arr[right] + arr[left];
            if (sum == find) {
                System.out.println(arr[left] + " " + arr[right]);
                break;
            } else if (sum < find) {
                left++;
            } else {
                right--;
            }
        }

    }

    public static void main(String args[]) {
        int[] arr = { 7, 2, 5, 9, 10 };
        int find = 17;
        SlidingWindow(find, arr);

    }
}
