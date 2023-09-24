package Normal;
/**
 * binarysearch
 */
public class binarysearch {

    public static void main(String args[])
    {
        int arr[] = {0,2,3,4};
        int high = arr.length-1;
        int low = 0;
        int find=1 ;
        int mid=low;
        int count=0;
        while(arr[mid]!=find)
        {
            mid=(high+low)/3;
            count++;
            if(arr[mid]>find)
            {
                high=mid-1;
            }
            else if(arr[mid]<find)
            {
                low=mid+1;
            }
            else {
                System.out.println("the element is found at"+mid);
                break;
            }
            if(count==arr.length/2)
            {
                System.out.println("the element can be inserted in the "+(mid+1));
                break;
            }
        }
    }
}