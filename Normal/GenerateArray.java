package Normal;
import java.util.Random;

public class GenerateArray {
    public static void main(String[] args) {
        int size = 10000; // Specify the size of the array

        int[] array = generateRandomArray(size);

        // Print the generated array with a comma between each value
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            // Print a comma unless it's the last element
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        // Set random numbers in random positions
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(size) + 1;
            int randomPosition = random.nextInt(size);

            array[randomPosition] = randomNumber;
        }

        return array;
    }
}
