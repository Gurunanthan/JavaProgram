package DSA;

class pen{
    String color;
    String name;
    String type;
    void writes(){
        System.out.println("writing something");
    }
    void run(){
        String color="black";  
        System.out.println(this.color);
    }
    pen(String name){
        this.color=name;
        System.out.println("jbiub");
    }
}

public class Classandobject {
    public static void main(String[] args) {
        
        pen x = new pen("red");
        x.color="blue";
        x.writes();
        x.run();
    }
    
}
