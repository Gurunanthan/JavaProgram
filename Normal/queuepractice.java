package Normal;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class queuepractice {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int choice=0;
        int rear=-1;
        while(choice!=4)
        {
            System.out.println("Enter the choice : ");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(rear==arr.length-1)
                    {
                        System.out.println("the stack is full");
                    }
                    else{
                        System.out.println("enter the element");
                        int element=sc.nextInt();
                        rear++;
                        arr[rear]=element;

                
                    }
                    break;
                case 2:
                    if(rear==-1)
                    {
                        System.out.println("the stack is empty");

                    }
                    else
                    {
                        rear--;
                    }
                case 3:
                    for(int i=rear;i>-1;i--)
                    {
                        System.out.println(arr[i]);
                    }
                    
            }

        }
    }
}
