package JavaCore;
import java.util.Scanner;
public class JA1_7_06 {
    public static boolean nguyento (int n)
    {
        int j=(int)Math.sqrt(n);
        for (int i=2;i<=j;i++) if (n%i==0) return false;
        return true;
    }
    public static void main (String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("nhap vao so nguyen n: ");
            n = sc.nextInt();
        } while (n<=0);
        for (int i=2;i<=n;i++)
        {
            while (nguyento(i)&&n%i==0)
            {
                    System.out.print(i+" ");
                    n/=i;
            }
        }
        sc.close();
    }
}
