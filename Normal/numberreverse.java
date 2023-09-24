package Normal;
public class numberreverse {
    public static void main(String[] args) {
        int num = 200;
        int remainder=1,ex=0;
        System.out.println("harshad number");
        while(num!=0)
        {
            remainder=num%10;
            num = num/10;
            // add the below line to reverse the number
            //ex=ex*10+remainder;
            ex=ex*10+remainder;
            System.out.println(ex);

        }
        if(num/ex==0){
            System.out.println("it is a harshad number");
        }
        else{
            System.out.println("it is not a harsad number");
        }
        
    }
}
