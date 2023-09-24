package Normal;
import java.util.Scanner;

public class mergetwosortedarray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int firstarr[]=new int[size1];
        int secondarr[]= new int[size2];
        System.out.println("ENter the first array element");
        for (int i = 0; i < firstarr.length; i++) {
            firstarr[i]=sc.nextInt();            
        }
        System.out.println("enter the element of the second array");
        for (int i = 0; i < secondarr.length; i++) {
            secondarr[i]=sc.nextInt();
        }
        int mergek[]=new int[firstarr.length+secondarr.length];
        for (int i = 0; i < mergek.length; i++) {
            for(int j=1;j<mergek.length;j++)
            {
                if(firstarr[i]>secondarr[j]){
                    if(firstarr.length > secondarr.length)
                    {
                        mergek[j]=firstarr[j];
                    }
                    else{
                        mergek[j]=secondarr[j];
                    }
                }
                else if(firstarr[i]>secondarr[j])
                {
                    mergek[j]=secondarr[i];
                    mergek[j+1]=firstarr[j];
                }
            }
            
        }
    }
}
