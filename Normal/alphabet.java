package Normal;
public class alphabet {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(64+i));
            }
            System.out.println("");
            
        }int count=0;
        for (int i = 10; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print((char)(65+count));
                count++;
            }
            System.out.println("");
            
        }
        //invert alpha advanced
        // int n = 6;
        // for (int i = 0; i <n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print((char)(96+n-(i-j)));
                
        //     }
        //     System.out.println("");
            
        // }
        //intresting alphabet
        char d='a';
        int n=10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(d+n-(i-j)-1));
            }
            System.out.println(" ");
            
        }
        //mirrored alphabet with intresting pattern
        char num='a';
        int z=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 10; j >= i; j--) {
               System.out.print(" ");
                
            }
            int q=0;
            for (int j2 = 0; j2 < i; j2++) {
                System.out.print((char)(num+z));
                z=j2+q+1;
                // System.out.println(z);
            }
            System.out.println("");

            
        }
        
        
    }

}