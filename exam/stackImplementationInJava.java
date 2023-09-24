package exam;
import java.util.*;

public class stackImplementationInJava {
    public static void main(String[] args)
    {
        Stack <Integer> st = new Stack<>();
        for (int index = 0; index <10;index++) {
            st.push(index);
        } 
        System.out.println(st.peek());
        System.out.println(5);
        for(int i = 0; i < 10; i++)
        {
            System.out.print( st.pop());
        }

    }
}
            