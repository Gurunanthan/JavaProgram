class panchayath 
{
    int a =10;
    void printz()
    {
        System.out.println(this.a);
    }

}


public class ChildParentAccess extends panchayath{
    public static void main(String[] args) {
        ChildParentAccess cd = new ChildParentAccess();
        cd.a=10;
    }
}
