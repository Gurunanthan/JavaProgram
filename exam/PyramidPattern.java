
public class PyramidPattern {
    public static void main(String[] args)
    {
        // char s='*';
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                
                if(k>=5-i )
                {
                    System.out.print(k+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
    }
}
