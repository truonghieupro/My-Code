package JavaMethods;

public class JA3_2_05 {
    public static void main(String[] args) {
        double a=2,b=2;
        System.out.println("ket qua la: "+log(a,b));
    }
    public static double log( double a, double b)
    {
        return Math.log(a)/Math.log(b);
    }
}
