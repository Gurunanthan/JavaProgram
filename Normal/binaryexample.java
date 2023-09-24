package Normal;
public class binaryexample {
    public static void main(String[] args)
    {
        boolean arr[]={true,true,false,false};
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==false)
            {
                System.out.println(mid);
            }
            else if(arr[mid]!=true)
            {
                low=mid+1;
                System.out.println(mid                                       
                
                );
            }
            else
            {
                high=mid-1;
            }
        }
    }   
}
