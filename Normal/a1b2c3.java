package Normal;
public class a1b2c3 {
    public static void main(String[] args)
    {
        String s="a1b2c3";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='1' && s.charAt(i)<='9')
            {
                for (int j = 0; j < (int)(s.charAt(i))-48; j++) {
                    System.out.print(s.charAt(i-1));
                };
            }
            System.out.println((int)(s.charAt(i)));
        }
         
    }
    
}
