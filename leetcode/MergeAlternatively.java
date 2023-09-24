package leetcode;

class MergeAlternately {
    public static String mergeAlternately(String word1, String word2) {
        String result="";
        Character s[] = new Character[word1.length() + word2.length()];
        for(int i=0;i<word1.length();i++)
        {
            s[i*2]=word1.charAt(i);
            System.out.println(s[i]+" first");
        }
        for(int i=0;i<word2.length();i++)
        {
            s[i*2+1]=word2.charAt(i);
            System.out.println(s[i]+" Second");
        }
        for (Character c : s) {
            if (c != null) {
                result += c;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab","pqrs"));
    }
}