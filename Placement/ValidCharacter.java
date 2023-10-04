package Placement;

import java.util.*;

public class ValidCharacter {
    public static void main(String[] args) {
        Stack<Character> paranthesis = new Stack<>();
        String s = "[{}]{()[]}";
        for (int index = 0; index < s.length(); index++) {
            char brackets = s.charAt(index);
            if (brackets == '{' || brackets == '[' || brackets == '(') {
                paranthesis.push(brackets);
            } else if (brackets == '}' || brackets == ']' || brackets == ')') {
                if (paranthesis.isEmpty()) {
                    System.out.println("the brackets are not balanced");
                }
                char top = paranthesis.pop();
                if ((brackets == '}' && top != '{') || (brackets == ')' && top != '(')
                        || (brackets == ']' && top != '[')) {
                    System.out.println("the paranthesis is not balanced");
                    return;
                }
            }

        }
        if (paranthesis.isEmpty()) {
            System.out.println("The brackets are balanced");
        } else {
            System.out.println("The brackets are not balanced");
        }
    }

}
