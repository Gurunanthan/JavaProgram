package Normal;



import java.util.Scanner;

public class simulate {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the coefficients of the equations
        System.out.println("Enter the coefficients of the first equation:");
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();

        System.out.println("Enter the coefficients of the second equation:");
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double c2 = sc.nextDouble();

        System.out.println("Enter the coefficients of the third equation:");
        double a3 = sc.nextDouble();
        double b3 = sc.nextDouble();
        double c3 = sc.nextDouble();

        // Get the constants on the right-hand side of the equations
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();

        // Solve the system of equations
        double x = (d1 * b2 - d2 * b1) / (a2 * b1 - a1 * b2);
        double y = (d1 * c2 - d2 * c1) / (a2 * c1 - a1 * c2);
        double z = (d1 - a1 * x - b1 * y) / c1;

        System.out.println("x = " + (int)(x));
        System.out.println("y = " + (int)(y));
        System.out.println("y = " + (int)(z));
     }
}
