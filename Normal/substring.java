package Normal;
import java.util.Scanner;

public class substring {
    public static void main(String args[])
    {
        String st =  "abdeen";
        for (int i = 0; i <=st.length(); i++) {
            for (int j =i+1; j <=st.length(); j++) {
                System.out.println(st.substring(i, j));
                //System.out.println(i+" "+j);
            }
            System.out.println("");
        }
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "geeks for geeks";
        String[] arrOfStr = s.split(" ");
  
        for (String string : arrOfStr) {
            System.out.print(string+" ");
        }

    }
}
