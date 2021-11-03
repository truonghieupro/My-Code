package JavaMethods;
import java.util.*;
public class JA3_1_12 {
    public static void main(String[] args) {
       int n;
       Scanner x = new Scanner(System.in);
       do {
           System.out.println("nhap so phan tu cua mang; ");
           n=x.nextInt();
       } while (n<=0);
       int[] a = new int[n];
       NhapMang(a,n);
       Arrays.sort(a);
       HienMang(a);
       x.close();
    }
    public static void NhapMang (int[] a,int n)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("nhap cac phan tu mang: ");
        for (int i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        x.close();
    }
    public static void HienMang (int[] a)
    {
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

}
