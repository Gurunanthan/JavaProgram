import java.util.Scanner;

// the program to validate the password given whether it satisfies the constraints given
public class ValidationOfPassword {
    public static boolean validate(String s)
    {
        String PASSWORD_PATTERN = "^(?=.*(A-Z))(?=.*(a-z))(?=.*\\d)(?=.*\\s)(?=.*[!@#$%^&*()_+]).*$";
        return(s.matches(PASSWORD_PATTERN));
    }
    public static void main(String args[])
    {
        long initial=System.currentTimeMillis();
        try (Scanner sc = new Scanner(System.in)) {
            String s =sc.next();
            if(!validate(s))
            {
                System.out.println("Valid password");
            }
        }
        long finals=System.currentTimeMillis();
        System.out.println();
        System.out.println("Time of execution in ms :"+(finals-initial)/1000);
    }
}
