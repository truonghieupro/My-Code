package JavaCore;
import java.util.Scanner;
public class JA1_6_02 {
    public static void main(String [] args)
    {
        double Toan,Van,Anh,tb=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem Toan: ");
        Toan=sc.nextDouble();
        System.out.println("Nhap diem Anh: ");
        Anh=sc.nextDouble();
        System.out.println("Nhap diem Van: ");
        Van=sc.nextDouble();
        tb=(Toan+Anh+Van)*1.0/3;
        if (tb <=4)
            System.out.println("Xep Loai Yeu");
        else if (tb >4 && tb <=6.5)
            System.out.println("Xep Loai Trung Binh");
        else if (tb >6.5 && tb <=8)
            System.out.println("Xep Loai Kha");
        else if (tb >8 && tb <=9)
            System.out.println("Xep Loai Gioi");
        else if (tb >9)
            System.out.println("Xep Loai Xuat Sac");
        else
            System.out.println("Khong Hop Le");
        sc.close();    
    }
}
