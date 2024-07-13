package SOLID;

public class hotel {
    public static void main(String[] args) {
        NonVeg nonveg = new NonVeg();
        Vegan vegan = new Vegan();
        vegan.totalAmount(50);
        nonveg.totalAmount(90);
        vegan.discount_amount(10);
        nonveg.discount_amount(0);
    }
}

interface TotalAmt {
    void totalAmount(int nos);
}


abstract class discount{
    abstract void discount_amount(int percentage)
    {
        System.out.println("There is no discount");
    }
}

class NonVeg implements TotalAmt extends discount {
    @Override
    public void totalAmount(int nos) {
        System.out.println("The total amount for non-veg is " + nos * 50);
    }
}

class Vegan implements TotalAmt extends discoun {
    @Override
    public void totalAmount(int nos) {
        System.out.println("The total amount for vegan is " + nos * 60);
    }
    void discount_amount(int percentage){
        System.out.println(" the percentage of discount is "+ percentage);
    }
}
