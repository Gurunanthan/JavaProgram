package exam;

public class replaceOsWithXs {
    public static String Xo(String s)
    {
        String st="";
        if(s.isEmpty())
        {
            return"";
        }
        char ch = s.charAt(0);
        if(ch==('o'))
        {
            return "x"+Xo(s.substring(1));

        }
        else{
            return ch+Xo(s.substring(1));
        }

    }
    public static void main(String args[])
    {
        System.out.println(Xo("hello world"));
    }

}
