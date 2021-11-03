package JavaMethods;

public class JA3_2_01 {
    public static void main(String[] args) {
        double n=2.34;
        System.out.println(+LamTronXuong(n));
        System.out.println(+LamTronLen(n));
    }
    public static double LamTronXuong (double n)
    {
        double a= Math.floor(n);
        return a;
    }
    public static double LamTronLen (double n)
    {
        double b= Math.ceil(n);
        return b;
    }
}
