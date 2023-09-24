package exam;
public class PrintBinaryEquivalentofanIntegerusingRecursion {
    public static void binary(int n)
    {
        if(n==0)
        {
            return ;
        }
        else{
            System.out.println(Integer.toBinaryString(n));
            binary(n-1);
        } 
    }
    public static void main(String args[])
    {
        binary(5);
    }
}
