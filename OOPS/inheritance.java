package OOPS;

class animal {
    String name;
    String animal;

    // ! animal(String name, String animal){
    // ! this.name=name;
    // ! this.animal=animal;
    // !}
    public void display() {
        System.out.println("i am " + name + " i fuck " + animal);
        
    }
}

class human extends animal {

    int print() {
        System.out.println("hello " + name);
        return 1;
    }

}

public class inheritance {
    public static void main(String[] args) {
        animal h1 = new human();
        h1.name = "Saravanan";
        h1.animal = "dog";
        h1.display();
        System.out.println(((human) h1).print());
    }

}
