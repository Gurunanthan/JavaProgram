package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllPossibleBrackets {
    public static List<String> PossibleBrackets(int n) {
        int open = 0;
        int close = 0;
        List<String> result = new ArrayList<>();
        recursive("", open, close, result, n);
        return result;
    }

    static void recursive(String bracket, int open, int close, List<String> result, int n) {
        if (bracket.length() == n * 2) {
            result.add(bracket);
            return;
        }
        if (open < n) {
            recursive(bracket + "(", open + 1, close, result, n);
        }
        if (close < open) {
            recursive(bracket + ")", open, close + 1, result, n);
        }
    }

    public static void main(String[] args) {
        List<String> brackets = PossibleBrackets(3);
        for (String bracket : brackets) {
            System.out.println(bracket);
        }
    }
}
