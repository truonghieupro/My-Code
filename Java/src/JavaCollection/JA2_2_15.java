package JavaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JA2_2_15 {
    public static void main(String[] args) {
        XuatListHaiChieu(NhapListHaiChieu());
    }
    public static List<List<Integer>> NhapListHaiChieu ()
    {
        List<List<Integer>> list = new ArrayList<>();
        Scanner x = new Scanner(System.in);
        System.out.println("nhap so phan tu list");
        int n=x.nextInt();
        for (int i=0;i<n;i++)
        {
            System.out.printf("nhap so phan tu tung list nho,list[%d]: ",i);
            int m=x.nextInt();
            List<Integer> songuyen=new ArrayList<>();
            for (int j=0;j<m;j++)
            {
                System.out.printf("list[%d][%d]= ",i,j);
                int so=x.nextInt();
                songuyen.add(so);
            }
            list.add(songuyen);
        }
        x.close();
        return list;
    }
    public static void XuatListHaiChieu (List<List<Integer>> list)
    {
        for (int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i));
        }
    }
}
