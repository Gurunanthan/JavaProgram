import java.util.Scanner;

abstract class Methods {
    int a;

    Methods(int a) {
        this.a = a;
    }

    void systemPrint() {
        System.out.println("Value from getValue(): " + a);
    }

    abstract void getValue(int a);
}

public class AbstractionWithNonAbstractMethods extends Methods {

    public AbstractionWithNonAbstractMethods(int a) {
        super(a);
    }

    @Override
    void getValue(int a) {
        // Concrete implementation of the abstract method
        this.a = a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");

        int userValue = scanner.nextInt();

        AbstractionWithNonAbstractMethods instance = new AbstractionWithNonAbstractMethods(userValue);

        instance.systemPrint();

        scanner.close();
    }
}
