class Parent {
    void x() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public void x() {
        System.out.println("Child");
    }
}

public class Example {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        Parent pc = new Child();

        // Invoke the method x() using parentheses
        p.x();  // Output: Parent
        c.x();  // Output: Child
        pc.x(); // Output: Child (dynamic method dispatch, invoking Child's implementation)
    }
}
