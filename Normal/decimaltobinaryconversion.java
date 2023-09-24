package Normal;
public class decimaltobinaryconversion {
    public static void main(String[] args)
    {
        int n=21;
        int x = n;
        int rev=0;
        int i=0;
        int binaryarray[]=new int[5];
        while(x!=0)
        {
            int temp=x%2;
            x/=2;
            binaryarray[i]=temp;
            i++;

        }
        for (int j = 3; j >=0; j--) {
            System.out.print(binaryarray[j]);   
        }
    }
}
