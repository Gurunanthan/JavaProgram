
public class permutationUsingrecursion {
    public static int permutationUsingrecursions(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else{
            return n*permutationUsingrecursions(n-1);
        }
    }
    public static void main(String args[])
    {
        System.out.println(permutationUsingrecursions(5)/(permutationUsingrecursions(5-3)));
    }
}
