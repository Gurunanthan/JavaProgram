package leetcode;

import java.util.*;

public class StringCompression {
    public static int compressString(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char element = chars[i];
            if (frequencyMap.containsKey(element)) {
                int frequency = frequencyMap.get(element);
                frequencyMap.put(element, frequency + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }
        System.out.println(frequencyMap);
        return 0;  // You may need to implement the actual compression logic here.
    }

    public static void main(String[] args) {
        System.out.println(compressString(new char[] {'a','a','b','b','c','c','c'}));
    }
}
