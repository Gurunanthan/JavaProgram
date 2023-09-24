package exam;
import java.util.HashMap;
public class CountTheNumberOfOccurrencesInTheArray {
    public static void main(String args[]) {
        char arr[]={'a','b'};
        HashMap <Character,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            char element = arr[i];
            if(map.containsKey(element))
            {
                int count = map.get(element);
                map.put(element, count+1);
            }
            else{
                map.put(element,1);
            }
        }
        System.out.println(map);


    }
}
