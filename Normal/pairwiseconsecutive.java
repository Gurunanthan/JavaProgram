package Normal;
public class pairwiseconsecutive {
    public static void main(String args[])
    {
        int arr[] ={4, 5, -2, -3, 11, 10, 5, 6, 20,23};
        boolean truce =true;
        for (int i = 0; i < arr.length; i+=2) {
            if(i+1<arr.length)
            {

                if(arr[i]+1==arr[i+1] || arr[i]-1==arr[i+1])
                {
                    truce=true;
                    
                }
                else{
                    truce=false;
                    break;
                }
            }
        }
        if(truce)
        {
            System.out.println("it is consecutive");
        }
        else{
            System.out.println("it is not consecutive");
        }
    }
}
