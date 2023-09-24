package Normal;
import java.util.Arrays;
import java.util.Collections;
public class joyinfo {
    // 
    public static void main(String[] args)
    {
        Integer arr[] = {1,1,2,3,4,1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(i!=j)
                {
                    if(arr[i]==arr[i])
                    {
                        break;
                    }
                    else{
                        System.out.println("the values are"+arr[i]);
                    }
                }
            }
        }
    }
}
