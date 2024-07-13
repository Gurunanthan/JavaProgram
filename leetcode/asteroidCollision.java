package leetcode;
import java.util.Stack;
    
public class asteroidCollision {
    public static int[] AsteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int diff = asteroid + stack.peek();
                if (diff > 0) {
                    asteroid = 0;
                } else if (diff < 0) {
                    stack.pop();
                } else {
                    asteroid = 0;
                    stack.pop();
                }
            }
            if (asteroid!= 0) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
    public static void main(String[] args) {

        // Test case 1
        int[] asteroids1 = {5, 10, -5};
        int[] result1 = AsteroidCollision(asteroids1);
        printResult(asteroids1, result1);

        // Test case 2
        int[] asteroids2 = {8, -8};
        int[] result2 = AsteroidCollision(asteroids2);
        printResult(asteroids2, result2);

        // Test case 3
        int[] asteroids3 = {10, 2, -5};
        int[] result3 = AsteroidCollision(asteroids3);
        printResult(asteroids3, result3);
    }

    private static void printResult(int[] asteroids, int[] result) {
        System.out.print("Original asteroids: ");
        for (int asteroid : asteroids) {
            System.out.print(asteroid + " ");
        }
        System.out.println();

        System.out.print("After collision: ");
        for (int asteroid : result) {
            System.out.print(asteroid + " ");
        }
        System.out.println();
    }
}