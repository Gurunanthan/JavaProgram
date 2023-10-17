package Placement;

import java.util.*;

public class FindingCommonElementUsingTreeSet {
    public static void main(String[] args) {
        Set<Integer> ts = new TreeSet<>();
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();
        s1.retainAll(s2);
        ts.addAll(s1);
        for (int var : s1) {
            System.out.println(var);
        }
    }
}
