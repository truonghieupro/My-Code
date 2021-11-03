package JavaCollection;
import java.util.*;
public class JA2_1_05 {
    public static void main(String[] args) {
        int n,c=0,l=0;
        Scanner s=new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang: ");
        n= s.nextInt();
        int[] a =new int[n];
        int[] le =new int[n];
        int[] chan =new int[n];
        System.out.println("nhap cac phan tu cho mang: ");
        for (int i=0;i<n;i++)
        {
            System.out.println("nhap phan tu thu "+i+":");
            a[i]=s.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            if (a[i]%2!=0)
            {
                le[l]=a[i];
                l++;
            }
            else
            {
                chan[c]=a[i];
                c++;
            }
        }
        System.out.print("mang chan: ");
        for (int i=0;i<c;i++)
        {
            System.out.print(chan[i]+" ");
        }
        System.out.print("\nmang le: ");
        for (int i=0;i<l;i++)
        {
            System.out.print(le[i]+" ");
        }
        s.close();
    }
}
