import java.util.*;


class student{
    String name;
    int rollno;
    static int x=0;
    student()
    {
        student.x+=1;
    }
    // protected void some() throws Throwable
    // {
    //     System.out.println("object is destroyed");
    // }
}

public class ClassArrayInJava
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // student[] s1 = new student[2];
        // for (int i = 0; i < 2; i++) {
        //     s1[i] = new student();
        //     s1[i].name = sc.next();
        //     s1[i].rollno = sc.nextInt();
        // }
        // for (int i = 0; i < 2; i++) {
        //     System.out.println("Name: "+s1[i].name+" rollno: "+s1[i].rollno);
        // }
        // System.out.println(Arrays.toString(s1));
        // System.out.println((s1.getClass()));
        student sm;
        // for(int i=0;i<100000000;i++)
        // {
        //     sm = new student();
        //     System.out.println(sm.x);
            
        // }
        // student sm2 = new student();
        System.out.println(student.x);
        System.out.println(student.x);


    }
}