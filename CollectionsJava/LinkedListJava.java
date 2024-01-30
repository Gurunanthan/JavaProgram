package CollectionsJava;
import java.util.*;
public class LinkedListJava {
    public static void main(String[] args) {
        
        List<Integer> li = new LinkedList<>();
        // adding elements to list
        for(int i=0;i<10;i++)
        {
            li.add(i);
        }

        // retrieving a paticular element

        System.out.println(li.get(5));

        // deleting a paticular element using index

        System.out.println(li.remove(0)); // removes the 0th indexed element

        // deleting a paticular element
        li.remove(li.indexOf(5));

        // replace a paticular element in that position 
        
        


    }
}
