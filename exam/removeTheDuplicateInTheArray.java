package exam;
import java.util.HashSet;
import java.util.Set;
public class removeTheDuplicateInTheArray {
    public static void main(String args[])
    {
        int arr[] ={1,2,3,4,4,5,6,7,8,9,10};
        Set <Integer> unique= new HashSet<>();
        for (int i : arr) {
            unique.add(i);
        }
        for (int i : unique) {
            System.out.print(i+" ");
        }
    }
}
