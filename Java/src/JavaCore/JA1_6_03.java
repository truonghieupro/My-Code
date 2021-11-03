package JavaCore;
import java.util.Scanner;
public class JA1_6_03 {
    public static void main (String[] args)
    {
        int thang,nam;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap Nam: ");
        nam=sc.nextInt();
        System.out.println("Nhap Thang: ");
        thang=sc.nextInt();
        if (nam>1)
        {
            int songay = 0;
            switch (thang)
            {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    songay=31; break;
                case 4: case 6: case 9: case 11:
                    songay=30; break;
                case 2: if (nam%4==0&&nam%100!=0||nam%400==0) {songay=28;}
                    else {songay=29;}
                    break;
                default:
                    if(thang>12||thang<1) {
                        System.out.println("khong hop le");
                    }
            }
            System.out.println(thang+""+nam+"co"+songay);
        }
        else { System.out.println("Khong Hop Le"); }
        sc.close();
    }
}
