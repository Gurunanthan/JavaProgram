package Recursion;

public class removePaticularStringFromTheExistingStringUsingRecursion {

    public static String remover(String s, String toBeRemoved, String result) {
        if (s.length() == 0) {
            return result;
        }
        if (s.startsWith(toBeRemoved)) {
            return remover(s.substring(toBeRemoved.length()), toBeRemoved, result);
        }
        else{

            result += s.substring(0, 1);
        }
        return remover(s.substring(1), toBeRemoved, result);
    }

    public static void main(String[] args) {
        String s = "this is a string";
        String toBeRemoved = "string";
        System.out.println(remover(s, toBeRemoved, ""));
    }
}
