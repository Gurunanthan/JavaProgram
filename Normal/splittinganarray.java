package Normal;
import java.util.Scanner;
import java.util.Arrays;
public class splittinganarray {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the position to split");
        int input=sc.nextInt();
        int arr[] = {1,2,3,4,5};
        if(input >0 && input<arr.length)
        {

            int firstcopy[]=new int[input];
            int secondcopy[]=new int[arr.length-input];
            firstcopy=Arrays.copyOfRange(arr,0,input);
            secondcopy=Arrays.copyOfRange(arr,input,arr.length);
            System.out.print(Arrays.toString(firstcopy)+" "+Arrays.toString(secondcopy));
            Integer[] newarr=new Integer[5 ];
            
        }
    }
}
