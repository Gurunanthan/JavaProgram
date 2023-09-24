package Normal;
public class allzero {
    public static void main(String args[])
    {
        int arr[]={1,0,2,3,1,1,1}   ;
        String s="";
        for (int i = arr.length-1; i >-1; i--) {
            for (int j =arr.length-1;j>-1;j--) {
                // System.out.println("the arr[k] "+arr[j]);
                // System.out.println("the i "+i+" "+j);
                if(arr[j]==i)
                {
                    s+=i;
                }
                
            }
        }
        for(int i = s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
