class Parent {
    void same() {
        System.out.println("This is from parent");
    }
}

class Child extends Parent {
    @Override
    void same() {
        System.out.println("This is from child");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.same();
    }
}
