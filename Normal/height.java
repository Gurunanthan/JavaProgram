package Normal;
import java.util.*;
public class height {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element of the array:");
        int n,f,count=1;
        n=sc.nextInt();
        int arr[]=new int[10];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        f=arr[0];
        for(int i=1;i<n;i++){
            if(f<arr[i]){
                count++;
            }
        }
        System.out.println(count);



    }
    
}
