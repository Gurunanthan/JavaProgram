package DSA;
import java.util.Scanner;
public class stack {
    public static void main(String [] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int stack[] = new int[size];
            int top=-1;
            int choice=0;
            while(choice !=4)
            {
                System.out.println("\nenter your choice ");
                System.out.println("\n 1 push element into stack\n 2 pop element from the stack\n 3 display the stack\n 4 exit \n");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        if(size-1 == top)
                        {
                            System.out.println("the stack is over flown");
                        }
                        else{
                            System.out.println("enter the element to be added into the stack");
                            int element=sc.nextInt();
                            top++;
                            stack[top] = element;
                            //System.out.println("the value of the top"+top);
                        }
                        break;
                    case 2:
                        if(top==-1)
                        {
                            System.out.println("the stack is underflown");
                        }
                        else{
                            top-=1;
                        }
                        break;
                    case 3:
                        if(top==-1){
                            System.out.println("the stack has no element");

                        }
                        else{
                            System.out.println(" ");
                            System.out.print("stack elements ");
                            for (int i = top; i > -1; i--) {
                                System.out.print(stack[i]+" ");
                            }
                        }
                            
                        break;
                    default:
                    System.out.println("enter the valid choice");
                        break;
                }
            }
        }

    }
}
