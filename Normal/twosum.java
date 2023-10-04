package Normal;
public class twosum {
    public static void main(String[] args) {
        int arr[]={2,5,5,11};
        int target=10;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("the position is "+i+" and "+j);
                    break;
                }
                else{
                    System.out.println("no such number is not found");
                }
            }
        }
    }
}
