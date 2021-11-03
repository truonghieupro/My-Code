package JavaCore;
import java.util.Scanner;
public class JA1_7_05 {
    public static void main (String[] args)
    {
        int n;
        double tong=0;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("nhap vao mot so nguyen >0: ");
            n=sc.nextInt();
            if (n<=0) { System.out.println("hay nhap lai \n"); }
        } while (n<=0);
        for (int i=1;i<=n;i++)
        {
            tong+=1.0/(i*(i+1));
        }
        System.out.println("tong S("+n+")= "+tong);
        sc.close();
    }
}
