package leetcode;

public class PalindromicNumber {
    public static boolean palindromicnumber(int n)
    {
        int num = n;   
        int remainder=0;
        int sum=0;
        while(n>0)
        {
            remainder = n% 10;
            n/=10;
            sum = (sum*10)+remainder;

                    
        }
        return (sum==num)?true:false;
        
    }
    public static void main(String[] args) {
        System.out.println(palindromicnumber(121));
    }
}
