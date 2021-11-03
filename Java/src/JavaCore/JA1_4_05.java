package JavaCore;
import java.util.Scanner;
public class JA1_4_05 {
    public static void main(String[] args)
    {
        int quangduong,gio,phut,giay;
        double vantoc;
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("nhap quang duong m: ");
            quangduong=sc.nextInt();
            System.out.println("nhap gio: ");
            gio=sc.nextInt();
            System.out.println("nhap phut: ");
            phut=sc.nextInt();
            System.out.println("nhap giay: ");
            giay=sc.nextInt();
        }
        int seconds=gio*3600+phut*60+giay;
        vantoc=(quangduong/1000)/(seconds/3600);
        System.out.println("km/h= "+vantoc);
        vantoc=quangduong*1.0/seconds;
        System.out.println("m/s= "+vantoc);
        vantoc=quangduong/(seconds/3600);
        System.out.println("m/h= "+vantoc);
    }
}
