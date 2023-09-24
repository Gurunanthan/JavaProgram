package Normal;
import java.util.Scanner;

public class camelcase {
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            String str=sc.nextLine();
            String[] chararr=str.split(" ");
            String append="";
            for(String s:chararr)
            {
                String eachword=s;
                for (int i = 0; i < eachword.length(); i++) {
                    if(i==0)
                    {
                        int s1=(int)(eachword.charAt(i))-32;
                        append+=(char)(s1);
                    }
                    else{
                        append+=eachword.charAt(i);
                    }
                }
                append+=" "; 
            }
            System.out.println(append);
        }
    }
}

