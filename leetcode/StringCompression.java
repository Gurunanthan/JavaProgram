package leetcode;

import java.util.*;

public class StringCompression {
    public static int compressString(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char elements = chars[i];
            if (frequencyMap.containsKey(elements)) {
                int frequency = frequencyMap.get(elements);
                frequencyMap.put(elements, frequency + 1);

            } else {
                frequencyMap.put(elements, 1);
            }

        }
        System.out.println(frequencyMap);
        return 0;

    }
    public static void main(String[] args) {
        System.out.println(compressString({'a','a','b','b','c','c','c'}));   
    }
}
