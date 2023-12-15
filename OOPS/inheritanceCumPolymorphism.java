class Animals {
    void sounds() {
        System.out.println("Dont even know what Animals you are");

    }
}

class Dogs extends Animals {
    void sounds() {
        System.out.println("Bow");

    }
}

class Cats extends Animals {
    void sounds() {
        System.out.println("Meow");
    }
}

public class inheritanceCumPolymorphism {

    public static void main(String[] args) {
        Animals Cats = new Cats();
        Cats.sounds();
    }

}
