package Normal;
public class numberpattern {
    public static void main(String[] args)
    {
        // //for loop for number of lines
        for (int i = 0; i < 10; i++) {
            //for loop for the spaces from 1st to n-1
            for (int j = 10;j>i;j--){
                
                System.out.print(" ");
                
            }
        //     //then on the same line print the value at n
            for (int j2 = 1; j2 < i; j2++) {
                System.out.print(j2);
                
            }
            
            
            
            
            System.out.println(" ");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j+" ");
                
            }
            System.out.println();
            
        }
        // //inverted pyramid just change the first for loop
        // for (int i = 10; i > 0; i--) {
        //     for (int j = 10; j > i ; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(j+" ");
                
        //     }
        //     System.out.println();
            
        // }
        // //1234pattern
        // int j=1;
        // while(i<=n)
        // {
        //     while(j<=i)
        //     {
        //         System.out.print(p+j);
        //         z=p+j;
        //         j++;
        //     }
        //     System.out.println("");
        //     i++;
        // }


        //1001 pattern
        int n=16;
        for(int i=0; i<=n; i++)
        {
            for (int j = 0; j <=n; j++) {
                if(j==0 || j==i || j==n-i || j==n || i==0 || i==n )
                {
                    System.out.print("1");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
/*output 
        1 
       12 
      123 
     1234 
    12345 
   123456 
  1234567 
 12345678 
 */


 