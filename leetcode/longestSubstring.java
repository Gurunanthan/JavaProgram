package leetcode;

import java.util.*;

public class longestSubstring {
    public static int longestPossible(String input)
    {
        int longest =0;
        int left =0;
        int right =0;
        Set<Character> stringSet = new HashSet<>(); 

        while(right< input.length())
        {
            if(!stringSet.contains(input.charAt(right)))
            {
                stringSet.add(input.charAt(right));
                longest = Math.max(longest, stringSet.size());
                right++;
            }
            else{
                stringSet.remove(input.charAt(left));
                left++;
            }

        }
        return longest;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longestPossible(s));
        sc.close();

    }
}
