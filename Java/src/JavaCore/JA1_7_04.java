package JavaCore;
import java.util.Scanner;
public class JA1_7_04 {
    public static void main (String[] args)
    {
        int n,m,sotachra,tong=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen: ");
        n=sc.nextInt(); m=n;
        while (n!=0)
        {
            sotachra=n%10;
            tong+=sotachra;
            n/=10;
        }
        System.out.println("Tong cac chu so cua so "+m+" la "+tong);
        sc.close();
    }
}
