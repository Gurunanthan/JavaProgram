package Normal;
public class PentagonPattern {
    public static void main(String[] args) {
        int n = 5; // number of lines
        int width = n * 2 - 1; // width of the base line
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= width; j++) {
                if (j == n - i + 1 || j == n + i - 1 || i == n) {
                    // print asterisk at the vertices and on the base line
                    System.out.print("* ");
                } else {
                    // print space everywhere else
                    System.out.print("  ");
                }
            }
            System.out.println(); // move to the next line
        }
    }
}
