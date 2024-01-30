package CollectionsJava;

import java.util.*;

public class TreeSetJava {
    public static void main(String args[]) {
        
        // Creating a new tree set
        
        TreeSet<Integer> ts = new TreeSet<>();
        Iterator<Integer> it = ts.descendingIterator();

        // for adding elements
        
        for (int i = 0; i < 10; i++) {
            ts.add(i);
        }

        // Finding a particular element
        
        System.out.println(ts.contains(5));

        // Replace a particular element
        // Replacement is not possible because the arrangement will be not in the user given order ie insertion order 

        // Delete a particular element
        
        ts.remove(8);
        System.out.println("Element 8 deleted from the TreeSet.");

        // Print all elements
        
        System.out.println("All elements in descending order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
