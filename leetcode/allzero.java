package leetcode;

import java.util.*;

public class allzero {
    public static List<Integer> allzero(List<Integer> s) {
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i) == 0) {
                s.remove(i);
                s.add(0);
            }
        }

        return s;

    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            li.add(sc.nextInt());
        }
        System.out.println(allzero(li));
    }
}
