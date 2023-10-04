package Placement;
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(1);
        q.add(2);
        System.out.println(q);
        System.out.println(q.peek()); 
        System.out.println(q.remove(2));
        System.out.println(q.poll());
        System.out.println(q);

    }
}
