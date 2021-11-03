package JavaCore;
import java.util.Scanner;
public class JA1_7_03 {
    public static int nguyento (int n)
    {
        int j=(int)Math.sqrt(n);
        for (int i=2;i<=j;i++) if (n%i==0) { return 0;	}
        return 1;
    }
    public static void main (String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap mot so nguyen duong n: ");
        n=sc.nextInt();
        System.out.println("Tat ca cac so nguyen to nho hon "+n+" la");
        if (n==2) { System.out.println(+n); }
        for (int i=2;i<n;i++)
        {
            if (nguyento(i)==1) { System.out.println(+i); }
        }
        sc.close();
    }
}
