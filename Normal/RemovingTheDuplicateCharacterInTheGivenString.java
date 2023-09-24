package Normal;
public class RemovingTheDuplicateCharacterInTheGivenString {
    public static void main(String[] args) {
        String st = "Marry";
        int truce = 1;

        for (int i = 0; i < st.length(); i++) {
            truce = 1;
            for (int j = i + 1; j < st.length(); j++) {
                if (st.charAt(i) == st.charAt(j)) {
                    truce = 0;
                    break;
                }
            }
            if (truce == 1) {
                System.out.print(st.charAt(i));
            }
        }
    }
}
