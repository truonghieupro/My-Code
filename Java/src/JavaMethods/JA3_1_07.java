package JavaMethods;

public class JA3_1_07 {
    public static void main(String[] args) {
        int n=12;
        System.out.println("so fibonaci thu 12 = "+Fibonaci1(n));
        System.out.println("so fibonaci thu 12 = "+Fibonaci2(n));
    }
    public static int Fibonaci1 (int n)
    {
        if (n==1||n==2)
        {
            return 1;
        }
        return Fibonaci1(n-1)+Fibonaci1(n-2);
    }
    public static int Fibonaci2 (int n)
    {
        int f=1,f1=1,f2=1;
        for (int i=3;i<=n;i++)
        {
            f=f1+f2;
            f1=f2;
            f2=f;
        }
        return f;
    }
}
