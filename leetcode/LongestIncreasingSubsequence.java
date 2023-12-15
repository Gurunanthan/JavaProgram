// check the previous values and increament the counter the counter with max of value is the longest possible subsequence
package leetcode;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	public static int increasingSubsequence(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int dp[] = new int[nums.length];
		Arrays.fill(dp, 1);
		for (int i = 0; i < dp.length; i++) {
			for (int j = i - 1; j > -1; j--) {
				if (nums[i] > nums[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}

			}
		}
		int max = Arrays.stream(dp).max().getAsInt();
		return max;
	}

	public static void main(String[] ar) {
		int[] nums = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		int length = increasingSubsequence(nums);
		System.out.println("Length of Longest Increasing Subsequence: " + length);
	}
}
