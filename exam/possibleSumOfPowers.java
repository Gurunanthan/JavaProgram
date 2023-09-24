package exam;

public class possibleSumOfPowers {
    public static void main(String args[]) {
        int sum = 36;
        int n = 3;
        int count = 0;
        for (int i = 1; i * i <= sum; i++) {
            for (int j = 1; j * j <= sum; j++) {
                if (Math.pow(n, i) + Math.pow(n, j) == sum) {
                    count++;
                }
            }
        }

        // Print the number of possible sums.
        System.out.println("Output: " + count);
    }
}
