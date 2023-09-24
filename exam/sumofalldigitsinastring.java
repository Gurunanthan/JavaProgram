package exam;

public class sumofalldigitsinastring {
    public static void main(String[] args)
    {
        long programstart=System.currentTimeMillis();
        String s="1abc23";
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i)))
            {
                sum+=Character.getNumericValue(s.charAt(i));
            }
        }
        System.out.println(sum);
        long programend=System.currentTimeMillis();
        System.out.println((programend-programstart)/1000);
    }
}
