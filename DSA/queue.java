package DSA;
import java.util.Scanner;
public class queue {
    public static void main(String [] args)
    {
        
            try (Scanner sc = new Scanner(System.in)) {
                int qsize = sc.nextInt();
                int queue[] = new int[qsize];
                int front = 0;
                int rear = qsize;
                int choice = 0;
                while(choice !=4){
                    System.out.println("enter the number of your choice");
                    System.out.println("\n 1 Add the Element to the Queue\n 2 Delete the element in the Queue\n 3 Display the element in the Queue \n 4 Exit ");
                    System.out.println("enter here choice");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            if(rear==0)
                            {
                                System.out.println("the queue is full");
                            }
                            else
                            {
                                System.out.println(("enter the element"));
                                int element = sc.nextInt();
                                rear=rear-1;
                                queue[rear]=element;
                                System.out.println("the element is "+queue[rear]);
                                System.out.println("the rear is "+rear);
                            }
                            break;
                        case 2:
                            if(rear==qsize)
                            {
                                System.out.println("the queue is empty");
                                System.out.println("the element is "+queue[rear]);
                                System.out.println("the rear is "+rear);                                                                                                                                                                                                                                        
                            }
                            else
                            {
                                System.out.println("the element is poped");
                                rear=rear+1;
                            }
                            break;
                        case 3:
                            
                                System.out.println("the elements are");
                                System.out.println(""+rear);
                                for(int i = qsize-1; i >=0; i--)
                                {
                                    System.out.println(queue[i]);
                                }
                            
                            break;
                        case 4:
                            break;
                    
                        default:
                            break;
                    }
                }
            }
    }
}