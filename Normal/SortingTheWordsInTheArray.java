package Normal;
import java.util.Arrays;

public class SortingTheWordsInTheArray {
    public static void main(String[] args)
    {
        String arr[]={"India","Pakistan","Bangladesh"};
        System.gc();
        Arrays.sort(arr);
        for (String string : arr) {
            System.out.println(string);
        }
    }
}