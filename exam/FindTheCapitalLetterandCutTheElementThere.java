import java.util.Arrays;
public class FindTheCapitalLetterandCutTheElementThere {
    public static void main(String[] args)
    {
        String s ="Joyinfo";
        String [] first=s.split("(?=[A-Z])");
        System.out.println(Arrays.toString(first));
        
    }
}
