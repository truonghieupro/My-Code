package JavaCore;
import java.util.Scanner;
public class JA1_7_02 {
    public static void main (String[] args)
    {
        int a,b,ucln=0,bcnn=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap A: ");
        a=sc.nextInt();
        System.out.println("Nhap B: ");
        b=sc.nextInt();
        int tich=a*b;
        if (a == 0 || b == 0)
        {
            ucln=a+b;
        }
        else
        {
            if (a != b) {
                while (a != b) {
                    if (a > b) {
                        a -= b;
                    } else {
                        b -= a;
                    }
                }
            }
            ucln = a;
        }
        bcnn = tich / ucln;
        System.out.println(+a+" va "+b+" co UCLN la: "+ucln+" co BCNN la "+bcnn);
        sc.close();
    }
}
