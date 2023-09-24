package exam;

public class Compressthewordifuppercaseandlowercasecomes {
    public static void main(String[] args)
    {
        String s="Aaabb";
        String st = s.toLowerCase();
        String output = "";
        char[] characters = st.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            int count=1;
            while(i+1< characters.length && characters[i]==characters[i+1])
            {
                count++;
                i++;
            }
            output += Integer.toString(count)+characters[i];
        }
        System.out.println(output);

    }
}
