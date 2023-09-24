package Normal;
public class PrintNdigitIncreasingAndbothnumbersarenotequalorless {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String st = String.valueOf(i);
            boolean isIncreasing = true;
            for (int j = 0; j < st.length() - 1; j++) {
                for (int k = j + 1; k < st.length(); k++) {
                    if (st.charAt(j) >= st.charAt(k)) {
                        isIncreasing = false;
                        break;
                    }
                }
            }
            if (isIncreasing) {
                System.out.println(st);
            }
        }
    }
}
