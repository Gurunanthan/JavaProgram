import java.util.HashSet;
import java.util.Set;
public class UniqueSubstring {
    public static void main(String args[])
    {
        String s="Helloworld";
        Set<String> unique = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length(); j++) {
                unique.add(s.substring(i, j));
            }
        }
        for (String i : unique) {
            System.out.println(i);
        }
    }
}
