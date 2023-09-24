package exam;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
public class QueImplementation {
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.add(i);
            queue.offer(i);
        }
        System.out.println(queue);
        for (int i = 0; i < 20; i++) {
            System.out.println(queue.poll());
        }
        System.out.println(queue.contains(2));
        System.out.println(queue);
        System.out.println(queue.size());
    }
}
