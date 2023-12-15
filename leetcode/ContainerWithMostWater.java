package leetcode;

public class ContainerWithMostWater {
    public static int WaterContainerCalculator(int[] arr) {
        int max = 0;
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int area = Math.min(arr[i], arr[j]) * (j - i);
            max = Math.max(max, area);

            if (arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(WaterContainerCalculator(arr));
    }
}
