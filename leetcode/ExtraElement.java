package leetcode;

public class ExtraElement {
    public static void main(String[] args) {
        int firstArray[] = { 1, 2, 3, 4 };
        int secondArray[] = { 1, 2, 4 };
        int start = 0, end = firstArray.length - 1, mid = 0;
        // int index = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (firstArray[mid] == secondArray[mid]) {
                start = mid + 1;
            } else {
                System.out.println(mid);
                break;
            }
        }
        // System.out.println(index);
    }
}
