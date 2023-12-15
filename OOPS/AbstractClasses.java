abstract class parent{
    abstract void methods();
   
}

interface x{
    final static int age =10;
    void meth();
}

class children implements x{
    public void meth()
    {
        System.out.println("hello it implements abstract class");
    }
        
}




public class AbstractClasses
{
    public static void main(String[] args) {
        children child = new children();
        child.meth();
        
    }
}