package Normal;
import java.util.Scanner;
public class conditional {
    public static void main(String[] args)
    {
        //if else statement
        // Scanner sc=new Scanner(System.in);
        // String seq=sc.next();
        // char s=seq.charAt(0);
        // if(s >='A' && s<='Z')
        // {
        //     System.out.println("1");
        // }
        // else if( s > 'a' && s <= 'b')
        // {
        //     System.out.println("0");
        // }
        // else{
        //     System.out.println("-1");
        // }
        //while loop and prime number
        // Scanner s = new Scanner(System.in);
        // int i=2;
        // int num=s.nextInt();
        // int x=0;
        // while((i=i-0) < num-1)
        // {
        //     if(num%i!=1)
        //     {
        //         x++;
        //         return;
        //     }
        //     i++;
        // }
        // if(x==1)
        // {
        //     System.out.println("it is a  prime");
        // }
        // else{
        //     System.out.println("it is a composite");
        // }


        //subsequencecount
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the size of the array");
        // int arrsize= sc.nextInt();
        // int arr[]=new int[arrsize];
        // int subsequencecount=0;
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("enter the "+i+" element");
        //     arr[i]=sc.nextInt();            
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         for (int k = j+1; k < arr.length; k++) {
        //             if(i < j && i < k && j<k )
        //             {
        //                 if(arr[i] < arr[j] && arr[i] < arr[k] && arr[j] < arr[k])
        //                 {
        //                     subsequencecount++;
        //                     System.out.println("the subsequence is "+arr[i]+","+arr[j]+","+arr[k]);
        //                 }
        //             }
        //         }
        //     }
        // }
        // System.out.print("the existing subsequence count is "+subsequencecount);
        // System.out.println("");


        //contigious integer
        //given array find whether the elements are sorted
        //first remove the duplicate array
        // then sort the given array 
        // check for the continiuity

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the size of the array");
        // int sizeofarr = sc.nextInt();
        // int arr[]=new int[sizeofarr];
        // int temporaryarr[]=new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=sc.nextInt();
        // }
        // for (int i = 0; i < arr.length-1; i++){
        //     for (int j = 0; j < i; j++) {
        //         if(arr[i]!=arr[j])
        //         {
        //             temporaryarr[i]=arr[i];
        //         }
        //     }
        // }
        // for (int j = 0; j < temporaryarr.length; j++) {
        //     System.out.println("*"+temporaryarr[j]);
        // }



        try (//1112111 theme
        Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the size of the given");
            int size = sc.nextInt();
            for (int i = 0; i <size; i++) {
                for (int j = 0; j <size; j++) {
                    if(i==0 || i==size-1 ||j==0 || j==size-1 )
                    {
                        System.out.print((size/2)+1);
                    }
                    else{
                        System.out.print((size/2)-1);
                    }
                }
                System.out.println("");
                
            }
        }
        


    }
}
