package Normal;

class Human{
    String name;
    int age;
    static long population=0;

    Human(String name, int age)
    {
        this.name = name;
        this.age = age;
        Human.population++;
    }
}

public class population {
        public static class model{
            public void main(String[] args) {
                Human Alice = new Human("Alice",40);
                Human Bob = new Human("Bob",30);
                System.out.println(Human.population);
            }
        }
}
