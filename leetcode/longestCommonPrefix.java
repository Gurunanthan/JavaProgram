package leetcode;
import java.util.*;
public class longestCommonPrefix {
    public static String prefix(String [] strs)
    {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i =0; i< Math.min(first.length(),last.length());i++)
        {
            if(first.charAt(i)!=last.charAt(i))
            {
                // System.out.println(first); 
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};
        System.out.println(prefix(s));
    }
}
