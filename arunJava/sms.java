package arunJava;
import java.util.*;
public class sms{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int otp = sc.nextInt();
        int dur = sc.nextInt();
        System.out.println(otp+" is the One Time Password(OTP) to proceed, expires in "+dur+" mins.");

    }
}