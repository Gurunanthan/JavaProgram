package leetcode;


public class FindTheFirstAndLastOccurrenceOfTheNumber {
    public static int[] Occurrence(int[] nums, int target) {
        int occur[] = { -1, -1 };
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == target && nums[right] == target) {
                occur[0] = left;
                occur[1] = right;
                // return occur;
                break;
            } else if (nums[left] != target) {
                left++;
            } else {
                right--;
            }
        }
        return occur;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -1, 3 };
        int find = -1;
        int result[] = Occurrence(arr, find);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
