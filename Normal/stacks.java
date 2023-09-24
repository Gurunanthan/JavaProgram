package Normal;
import java.util.Scanner;

public class stacks{
    private int maxSize;// Constructor
    Scanner sc=new Scanner(System.in);
    private int[] stackArray;
    private int top;
    
    
    public stacks(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    
    // Push operation
    public void push(int value) {
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stackArray[top] = value;
    }
    
    // Pop operation
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = stackArray[top];
        top--;
        return value;
    }
    
    // Check if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
    
    // Check if stack is full
    public boolean isFull() {
        return (top == maxSize-1);
    }
    
    // Peek at the top of the stack
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }
    
    // Display the stack
    public void display() {
        System.out.print("Stack: ");
        for(int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
    
    // Main method
    public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
        stacks stack = new stacks(5);
        int choice;
        do {
            System.out.println("Enter your choice:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter the value to push:");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    int popValue = stack.pop();
                    if(popValue != -1) {
                        System.out.println("Popped value: " + popValue);
                    }
                    break;
                case 3:
                    int peekValue = stack.peek();
                    if(peekValue != -1) {
                        System.out.println("Peeked value: " + peekValue);
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while(choice != 5);
    }
}
