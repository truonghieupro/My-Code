package JavaCore;
import java.util.Scanner;
public class JA1_7_01 {
    public static void main (String[] args)
    {
        int n,tich=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao mot so: ");
        n=sc.nextInt();
        System.out.println("Cac uoc cua so n la: ");
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                System.out.print(" "+i);
                tich*=i;
            }
        }
        System.out.println(" \nTich cac Uoc do la: "+tich);
        sc.close();
    }
}
