package Placement;
import java.util.*;
public class listCollections {
    public static void main(String[] args) {
        List <Integer> li = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            li.add(i);
        }
        li.add(4);//add a element
        System.out.println(li.get(0));// retrieve a element from a paticular element;
        li.remove(2);//remove a paticular element
        System.out.println(li);
        li.set(2, 2);//paticular index la paticular element
        System.out.println(li);

    }
    // given an integer array a move all zero while maintaining the relative order of the non zero element
    //a=0,1,0,3,12
    // output
    // 1,3,12,0,0
}
