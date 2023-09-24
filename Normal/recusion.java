package Normal;
public class recusion {
    public static int rec(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else{
            return n*rec(n-1);
        }
    }
    public static void main(String args[])
    {
        int x=rec(150);
        System.out.println(x);
    }
}
