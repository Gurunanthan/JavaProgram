package Normal;
public class sumofdigits {
    public static void main(String[] args)
    {
        int n=456;
        int remainder=0;
        int sum=0;
        while(n!=0)
        {
            remainder=n%10;
            sum=sum*10+remainder;
            n/=10;
        }
        System.out.println(sum);
        System.out.println('c'+'c'+'c');
    }
}
