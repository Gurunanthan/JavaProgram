package exam;
public class CountoftheSubstringinTheGivenSubstring {
    public static void main(String[]args)
    {
        String st="dhimanman";
        String pattern="man";
        int counts=0;
        String [] count=st.split("(?=man)");
        for (int i=0; i<count.length;i++) {
            if(count[i].equals(pattern))
            {
                counts++;
            }
        }
        System.out.println(counts);
    }
}
