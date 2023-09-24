package Normal;
public class bestdaytobuythestock {
    public static void main(String[] args)
    {
        int arr[] ={7,1,5,3,6,4};
        int dayprofit=0;
        for(int i=0; i <arr.length;i++)
        {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j])
                {
                    if(dayprofit<(arr[i]-arr[j]*-1))
                    {
                        dayprofit=(arr[i]-arr[j]);
                    }
                }
            }
            System.out.println();
        }
        System.out.println(dayprofit);
    }
    
}
