package leetcode;

public class ReverseTheWordIgnoringTheExtraSpace {
    public static String RemoveSpaces(String s )
    {
        String spaceSplited[] = s.split(" ");
        String result ="";
        for (int i=spaceSplited.length-1;i>-1;i--) {
            if(!spaceSplited[i].isEmpty()){

                result+=spaceSplited[i]+" ";
            }
        }
        return result.trim();
    }
    public static void main(String[] args) {
        String s=RemoveSpaces("a good   example");
        System.out.println(s);
    }
}
