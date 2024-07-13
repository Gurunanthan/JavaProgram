public class ReverseEachwordInAnArray {
    public static void main(String args[])
    {
        String s= "Hello how are you";
        String arr[]=s.split(" ");
        String singleword="";
        String finals="";
        for (int i = 0; i < arr.length; i++) {
             singleword=arr[i];
             for (int j = singleword.length()-1; j >=0; j--) {
                finals+=singleword.charAt(j);
             }
             finals+=" ";
        }
        System.out.println(finals.trim());
    }
}
