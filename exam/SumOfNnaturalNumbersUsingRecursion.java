public class SumOfNnaturalNumbersUsingRecursion {
    public static int recursion_sum(int n)
    {
        if(n==0)
        {
            return 0;
        }   
        else{

            return n+recursion_sum(n-1);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(recursion_sum(5));
        
    }
}
