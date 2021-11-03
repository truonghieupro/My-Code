package JavaCore;
import java.util.Scanner;
public class JA1_4_04 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x,y,a,b,c;
        double khoangcach;
        System.out.println("nhap x: ");
        x = sc.nextInt();
        System.out.println("nhap y: ");
        y = sc.nextInt();
        System.out.println("nhap a: ");
        a = sc.nextInt();
        System.out.println("nhap b: ");
        b = sc.nextInt();
        System.out.println("nhap c: ");
        c = sc.nextInt();
        khoangcach=(Math.abs(a*x+b*y+c)/Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
        System.out.println("khoang cach mot diem den mot duong thang la: "+khoangcach);
        sc.close();
    }
}
