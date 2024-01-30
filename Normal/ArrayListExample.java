package Normal;
import java.util.*;
import java.util.Random;
// import java.util.Collection;
public class ArrayListExample{
    public static void main(String[] args) {
        Random s = new Random();
        Scanner sc = new Scanner(System.in);
        int deleteToken = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<50;i++)
        {
            arr.add(s.nextInt(5));
        }
        arr.remove(deleteToken);
        for(int  k:arr)
        {
            System.out.println(k);
        }    
        System.out.println();
        int sk = arr.get(49);
        System.out.println(sk);

        sc.close();

    }
}