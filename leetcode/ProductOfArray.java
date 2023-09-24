package leetcode;

import java.util.Arrays;

public class ProductOfArray {
    public static int[] CaluculateProduct(int nums[]) {
        int[] forwardArr = new int[nums.length];
        int result[] = new int[nums.length];
        int start =1;
        int nextStart =1;
        for (int i = 0; i < result.length; i++) {
            forwardArr[i]=start;
            start=start*nums[i];
        }
        for (int i = result.length-1; i >-1 ; i--) {
            result[i]=forwardArr[i]*nextStart;
            nextStart=nextStart*nums[i];

        }
        return result;
    }
    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        int result[] =CaluculateProduct(nums);
        System.out.println(Arrays.toString(result));
    }
}
