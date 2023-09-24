package Normal;
public class ncr {
    public static int factorial(int n)
    {
        int value=1;
        for (int i = 2; i <=n; i++) {
            value*=i;
        }
        return value;
    }
    public static void main(String[] args) {
        int fact=factorial(7);
        int rem=factorial(4);
        int nminusr=factorial(7-4);
        
        System.out.println(fact/(rem*nminusr));
    }
}
