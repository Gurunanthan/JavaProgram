

class Species {
    int years = 0;
    String eats= null;
    Species(int years) {
        this.years = years;
    }
    void eats(String food)
    {
        eats = food;
    }
}

class Human extends Species {
    String name = null;

    Human(String name, int age,String food) {
        super(age); 
        eats(food);
        this.name = name;
    }
}

public class In {
    public static void main(String[] args) {
        Human giri = new Human("Giri", 10,"Fruits");
        
        System.out.println("Name: " + giri.name + ", Age: " + giri.years+", Food: "+giri.eats);
    }
}
