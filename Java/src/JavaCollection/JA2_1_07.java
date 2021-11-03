package JavaCollection;

import java.util.Arrays;
import java.util.Scanner;

public class JA2_1_07 {
    public static void main(String[] args) {
        int n,m;
        Scanner a=new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang: ");
        n=a.nextInt();
        int[] s =new int[n];
        System.out.println("nhap cac phan tu cho mang: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(" nhap a ["+i+"]:");
            s[i]=a.nextInt();
        }
        System.out.println("nhap mot so nguyen: ");
        m=a.nextInt(); Arrays.sort(s);
        for (int i=0;i<s.length;i++)
        {
            if(s[i]==Arrays.binarySearch(s,m)) { System.out.println("vi tri dau tien cua so la "+i); break; }
        }
        a.close();
    }
}
