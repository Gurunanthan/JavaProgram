package Normal;
public class starpatter {
    public static void main(String[] args) {
        //inverted star
        for(int i=5;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
        //normal star
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.print("*");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < 10; i++) {
            //for loop for the spaces from 1st to n-1
            for (int j = 10;j>i;j--){
                
                System.out.print(" ");
                
            }
            //then on the same line print the value at n
            for (int j2 = 1; j2 < i; j2++) {
                System.out.print("*");
                
            }
            
            
            
            
            System.out.println(" ");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
        //inverted pyramid just change the first for loop
        for (int i = 10; i > 0; i--) {
            for (int j = 10; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
        
        //star pattern using while loop
        int z=0;
        int p=z;
        int n=4;
        int i=1;
        //square grid
        while(i<=n)
        {
            int j=1;
            while(j<=n)
            {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
        
        
    }
    
}
