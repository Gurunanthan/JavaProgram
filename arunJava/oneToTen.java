package arunJava;

public class oneToTen {
    static int rec(int n) {
        if (n == 0)
            return 0;
        return n+rec(--n);
        
    }
    //
    public static void main(String[] args) {
        System.out.println(rec(10));
    }
}
