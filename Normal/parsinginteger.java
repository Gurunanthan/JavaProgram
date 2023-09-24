package Normal;
public class parsinginteger {
    public static void main(String[] args) {
        String str = "1abc23";
        int num1=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                
                num1 += Integer.parseInt(str.substring(i,j));  // extracts the numerical value "1" from the string
                  // extracts the numerical value "23" from the string
            }
        }
                                 // prints "24"
    }
}
