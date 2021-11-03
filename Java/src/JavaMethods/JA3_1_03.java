package JavaMethods;

public class JA3_1_03 {
    public static int TinhGiaiThua (int n)
    {
        int gt=1;
        for (int i=1;i<=n;i++)
        {
            gt=gt*i;
        } return gt;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(" giai thua cua "+n+" = "+TinhGiaiThua(n));
    }
}
