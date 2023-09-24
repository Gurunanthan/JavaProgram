package Interview;
public class Findthepatternindex {
     public static void chkpattern(String str, String pattern) {
        for (int i = 0; i < str.length() - pattern.length() + 1; i++) {
            // System.out.println(str.length() - pattern.length() + 1);
            int j = 0;
            while (j < pattern.length()) {
                if (str.charAt(j+i) != pattern.charAt(j)) {
                    break;
                }
                j++;
            }
            if (j == pattern.length()) {
                System.out.println("Pattern found at index: " + i);
            }
        }
    }

    public static void main(String[] args) {
        chkpattern("hellobellistell", "ll");
    }
}
