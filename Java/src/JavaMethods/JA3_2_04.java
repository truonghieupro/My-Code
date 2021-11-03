package JavaMethods;

public class JA3_2_04 {
    public static void main(String[] args) {
        double a=1,b=2,c=3;
        System.out.println("so nho nhat trong 3 so la: "+TimSoNhoNhat(a,b,c));
    }
    public static double TimSoNhoNhat (double a,double b,double c)
    {
        return Math.min(c,Math.min(a,b));
    }
}
