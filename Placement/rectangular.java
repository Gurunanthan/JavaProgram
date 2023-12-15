package Placement;
import java.util.*;
public class rectangular {
    public static void rectangle(int c1, int c2, int n)
    {
        for(int i=0; i< n; i++)
        {
            for (int j = 0; j < n; j++) {
                if(Math.max(Math.abs(i-c1), Math.abs(j-c2))%2==0 || Math.max(Math.abs(i-c1), Math.abs(j-c2))==0)
                {
                    System.out.print("X");
                }
                else{
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rectangle(2,2,5);
    }
}
