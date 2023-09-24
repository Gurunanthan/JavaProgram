package Normal;
public class hollowdiamond {

    public static void main(String[] args)
    {
        int n=6;
        int mid=(n/2);
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n; j++) {
                if(j==mid-i|| j== mid+i || j==i-mid ||j==n+mid-i )
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
            
        }
        
        
    }
}