package Normal;
public class arrayaddingnumbersfromthelast {
    //public static int gcd(int a) {

    //}
    public static void main (String args[])
    {
        int arr[]={2,4,6};
        int count=0;
        int number=0;
        while(count!=arr.length)
        {
            number+=arr[count];
            number=number*10;
            count++;
        }
//        System.out.println(gcd(number/10));
    }
}
