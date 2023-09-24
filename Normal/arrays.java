package Normal;
import java.util.*;
public class arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sizeof the array");
        int sizeof = sc.nextInt();
        int arr[] = new int[sizeof];
        int i,element,high = sizeof-1,low=0;
        int tobefound= sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            arr[j]=sc.nextInt();
        }
        int elementfound=0;
        while(elementfound==1)
        {
            int mid=(high+low)/2;
            if(arr[mid] >= tobefound)
            {
                high=mid-1;
            }
            else if(arr[mid] <= tobefound)
            {
                low=mid+1;
            }
            else{
                elementfound=1;
            }
            if(elementfound==1)
            {System.out.println(arr[mid]);}
        }
    }
}
