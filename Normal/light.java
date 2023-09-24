package Normal;
import java.util.Scanner;

public class light {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean arr[] = new boolean[100];
        int choice=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=true;
        }
        while(choice!=3){
            System.out.println("\nEnter the choice of the light\nEnter the light to be showned ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                int skip=0;
                System.out.println("Enter the number of light skip");
                for (int j = 0; j <= 1; j++) {
                    
                     skip=j;
                     for (int i = skip; i <arr.length; i=i+skip+1) {
                         if(arr[i]==false)
                     {
                         arr[i]=true;
                     }
                     else{
                         arr[i]=false;
                     }
     
                 }
                }
                    
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
                    break;
                case 2:
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                }
                break;

                default:
                    break;
        }
        
        }
    }
}
