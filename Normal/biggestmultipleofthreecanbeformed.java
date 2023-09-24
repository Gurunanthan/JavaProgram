package Normal;
import java.util.Arrays;
import java.util.Collections;
public class biggestmultipleofthreecanbeformed {
    public static void main(String args[])
    {
        Integer arr[] ={1,1,0,0,5,8,9,7,4};
        Arrays.sort(arr,Collections.reverseOrder());
        String s= "";
        String sub="";
        int biggestMultipleOfThree = -1;
        for (int i = 0; i < arr.length; i++) {
            s+=arr[i];
        }  
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <= arr.length; j++) {
                sub=s.substring(i,j);
                if(Integer.parseInt(sub)%3==0 && Integer.parseInt(sub) > biggestMultipleOfThree)
                {
                    biggestMultipleOfThree = Integer.parseInt(sub);
                }
            }
        }
        System.out.println("Biggest multiple of 3 that can be formed is: " + biggestMultipleOfThree);
    }
}
