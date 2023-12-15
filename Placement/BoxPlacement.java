package Placement;
import java.util.*;
//box can be emptied by taking 1 or 3 at a time
public class BoxPlacement {
    public static int rec(int n)
    {
        if(n==1 || n==2)
        {
            return 1;
        }
        if(n==3)
        {
            return 2;
        }
        return rec(n-1)+rec(n-3);
    }
    public static void main(String[] args) {
        System.out.println(rec(new Scanner(System.in).nextInt()));   
    }
}
