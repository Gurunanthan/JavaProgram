package leetcode;
import java.util.*;
public class GCDofStrings{
    static String GCD(String word1,String word2)
    {
        String result = word1+word2;
        String k = "";
        Set<Character> s = new HashSet<>();
        if(word1.length()<0 || word2.length()<0)
        {
            return "";
        }
        for (int i = 0; i < result.length(); i++) {
            s.add(result.charAt(i));
        }
        for (Character i : s) {
            k+=i;
        }
        
        return k;
    }
    public static void main(String[] args) {
        System.out.println(GCD("abcd","abc"));
    }
}