
public class CompoundIntrestFormula {
    public static double Compound(int p, int n, double r, int t)
    {
        double calc = p * Math.pow(1 + (r / n), n * t);
        return calc;
    }
    public static void main(String [] args)
    {
        System.out.println(Compound(100, 3, 0.5, 1));
    }

}
