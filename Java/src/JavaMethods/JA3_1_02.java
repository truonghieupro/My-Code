package JavaMethods;

public class JA3_1_02 {
    public static void VeMotHang(int n)
    {
        for (int i=0;i<=n;i++)
        {
            System.out.print("*  ");
        }
    }
    public static void main(String[] args) {
        int n=8;
        for (int i=0;i<=n;i++)
        {
            VeMotHang(n);
            System.out.println();
        }
    }
}
