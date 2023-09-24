package Normal;
public class longestsubstring {
    public static void main(String[] args)
    {
        String s="baabcd";
        int count=0;
        char initial=s.charAt(0);
        for (int i = 1; i < s.length()-1; i++) {
            // System.out.println(s.charAt(i));
           
            // System.out.println(initial=s.charAt(i+1));

            if(s.charAt(i)==initial)
            {   
                initial=(char)(97+i);
                System.out.println(initial);
                count++;
            }
            else{
                break;
            }
        }
        
        System.out.println(count+" "+(char)(97+1));
    }
}
