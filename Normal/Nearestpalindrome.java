package Normal;
public class Nearestpalindrome {
    public static void main(String[] args)
    {
        int Nearestpalindrome = 1234;
        int Remainder=0,Exchange=0;
        for (int i = 1; i<Nearestpalindrome; i++) {
            while (Remainder==0) 
            {
                Remainder=i%10;
                i=i/10;
                Exchange=Exchange*10+Remainder;
                System.out.println(" "+Exchange);
            }
            if (Exchange==Nearestpalindrome) 
            {   
            }
            else{

            }
        }
        // for (int i = Nearestpalindrome;; i--) 
        // {
        //     while()            
        // }
    }
}
