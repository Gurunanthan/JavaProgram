package Normal;
public class splitcapitalletter {
    public static void main(String[] args)
    {
        String st = "JoyInfo";
        String empty="";
        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i)>=65 && st.charAt(i)<=65+26)
            {
                empty+=" "+st.charAt(i);
            }
            else{
                empty+=st.charAt(i);
            }
        }
        System.out.println(empty.trim());
    }
}
