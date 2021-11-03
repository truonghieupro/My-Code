package JavaCollection;
import java.util.*;
public class JA2_1_01 {
    public static void main(String[] args) {
       int n=5,tong;
       int[] a=new int [n];
       Scanner b=new Scanner(System.in);
       System.out.println("nhap tung phan tu mang: ");
        for (int i=0;i<n;i++)
        {
            a[i]=b.nextInt();
        }
        tong = Arrays.stream(a).sum();
        System.out.println(tong);
        b.close();
    }
}
