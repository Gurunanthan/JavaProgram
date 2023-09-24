package Normal;
public class evenoddarrayelements {
    public static void main(String args[]) {
        int arr[] = {1,2,5,8,7,9};
        int evenarr[]=new int[arr.length];
        int oddarr[]=new int[arr.length];
        int k=0;
        int l=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) {
                evenarr[k++]=arr[i];
            }
            else {
                oddarr[l++]=arr[i];
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(evenarr[i]+" ");
        }
        for (int i = 0; i < l; i++) {
            System.out.print(oddarr[i]+" ");
        }
    }
}
