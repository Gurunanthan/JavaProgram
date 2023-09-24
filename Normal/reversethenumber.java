package Normal;
public class reversethenumber {
    public static void main(String[] args)
    {
        int num=123;
        int temp=0;
        int sum=0;
        while(num>0)
        {
            temp=num%10;   
            num=num/10;
            sum=(sum*10)+temp;          
                    
        }
        System.out.println(sum);
    }
}
