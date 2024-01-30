package Normal;
import java.util.Scanner;

class ReverseEachWordWithoutUsingSplit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        int left = 0;
        String modifiedString = "";

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == ' ') {
                for (int j = i ; j >= left; j--) {
                    modifiedString += original.charAt(j);
                }
                modifiedString += " ";
                left = i + 1;
            }
        }
        for (int j = original.length() - 1; j >= left; j--) {
            modifiedString += original.charAt(j);
        }

        System.out.println(modifiedString.trim());
        sc.close();
    }
}
