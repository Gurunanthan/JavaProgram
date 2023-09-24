package OOPS;
import java.util.Scanner;

class student {
    String name;
    int id;

    
    student() {
        this.name = new Scanner(System.in).next();
        this.id = new Scanner(System.in).nextInt();

    }

    void update()
    {
        name=new Scanner(System.in).next();
    }

    void display() {
        System.out.print(name);
        System.out.println(id);
    }
}

public class construct {
    public static void main(String[] args) {
        student s = new student();
        student s1 = new student();
        s.update();
        s.display();
        s1.display();
    }
}
