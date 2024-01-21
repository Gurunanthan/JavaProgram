package Normal;

import java.util.Arrays;

public class PaypalIsHiring {
    public static String zigzag(String s,int numsrows)
    {
        String arr[] = new String[numsrows];
        Arrays.fill(arr, "");
        boolean direction = false;
        int count =0;
        for(int i=0;i<s.length();i++)
        {
            if(count ==0 || s.length()>=count)
            {
                direction = !direction;
            }
            char curr = s.charAt(i);
            arr[count] +=curr;
            count +=direction ? 1:-1; 
        }
        return String.join("",arr);
    }
    public static void main(String[] args) {
        System.out.println(zigzag("paypalishiring", 3));
    }
}
