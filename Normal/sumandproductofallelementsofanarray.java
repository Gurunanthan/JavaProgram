package Normal;
public class sumandproductofallelementsofanarray {
    public static void main(String[] args)
    {
        Integer[] a={1,2,3};
        int sum=0,product=1;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
            product*=a[i];
        }
        System.out.println(sum +" "+product);
    }
}
