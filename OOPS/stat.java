package OOPS;

class psvm{
    static  void adds()
    {
        System.out.println("jnf");

    }
    static void guru(){
        adds();
    }
    
}


public class stat {
    public static void main(String[] args)
    {
        
        psvm.adds();
        // psvm obj = new psvm();
        psvm.guru();
    }
}

