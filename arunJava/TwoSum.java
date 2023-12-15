package arunJava;

public class TwoSum {
    public static void main(String[] args) {
        String s = "sir";
        int left = 0;
        int right = s.length() - 1;

        boolean flag = true;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("palin");
        } else {
            System.out.println("nt pali");
        }

    }
}
