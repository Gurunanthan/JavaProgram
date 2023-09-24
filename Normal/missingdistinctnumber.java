package Normal;
import java.util.Scanner;

public class missingdistinctnumber {
    public static int distinct(int n,int[] arr)
    {
        int temp=0;
        for (int i = 0; i <n; i++) {
            for (int j = 1; j <=arr.length; j++) {
                if(j!=arr[i])
                {
                    temp=i;
                }
            }
        }
        return temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=10;
        int arr[]={6,1,2,8,3,4,6,7,10,5};
        int result=distinct(n, arr);
        System.out.println("the distinct element is "+result);
    }
}