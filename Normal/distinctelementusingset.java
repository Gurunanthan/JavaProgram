package Normal;
import java.util.*;
public class distinctelementusingset
{
    public static void main(String[] args)
    {
        Set <Integer> set =new HashSet<>();
        Integer[] arr = {1,5,2,8,6,7,5,8,6,2,5,9,5,5,8,8,5,5,8,5,4,4,7};
        for(int i:arr)
        {
            set.add(i);
        }
        System.out.println(set);

    }
}