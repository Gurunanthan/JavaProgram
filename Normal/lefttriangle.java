package Normal;
import java.util.Scanner;

public class lefttriangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <=10; j++) {
                if(i>=j || j>=10-i){
                    System.out.print("*");
                
                }
                else{
                     {
                        System.out.print(" ");
                        
                    }

                }
            }
            System.out.println("");
            
        }


        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <=10; j++) {
                if(i>=j || j>=10-i){
                    System.out.print("*");
                
                }
                else{
                     {
                        System.out.print(" ");
                        
                    }

                }
            }
            System.out.println("");
            
        }

    }
}
