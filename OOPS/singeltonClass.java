class singelton{
    int x = 10;
    static singelton  s = null;
    // private singelton()
    // {

    // }

    private static singelton createInstance()
    {
        if(s == null)s = new singelton();
               
        return s;
    } 
    public static singelton getInstance()
    {
        return createInstance();
    }
}

public class singeltonClass {

    public static void main(String[] args) {
        singelton s = singelton.getInstance();
        System.out.println(s.getInstance());
        System.out.println(s);
    }
}
