package Normal;
public class ifsamedoubleandthenmoveallthezerotothelast {
    public static void main(String[] args)
    {
        int arr[]={2,2,0,4,0,8};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                
                
                if(arr[i]==arr[j])
                {
                    arr[i]=arr[i]+arr[i];
                    arr[j]=0;
                    i++;
                }
                break;
                    
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){

                
            }
        }
        for (int j : arr) {
            
            System.out.println(j+" ");
        }
        
    }
}
