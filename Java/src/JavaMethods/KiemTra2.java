package JavaMethods;
import java.util.*;

public class KiemTra2 {
    public static void main(String[] args) {
        XuatMang(SapXepMang(NhapMang()));
    }
    public static List<Integer>[] NhapMang ()
    {
        Scanner sc = new Scanner(System.in); int n;
        System.out.println("nhap so phan tu cho mang");
        n=sc.nextInt();
        List<Integer>[] mang = new List[n];
        for (int i=0;i<n;i++)
        {
            System.out.printf("nhap so phan tu tung list nho,list[%d]: ",i);
            int m=sc.nextInt();
            List<Integer> songuyen=new ArrayList<>();
            for (int j=0;j<m;j++)
            {
                System.out.printf("list[%d][%d]= ",i,j);
                int so=sc.nextInt();
                songuyen.add(so);
            }
            mang[i]=songuyen;
        }
        sc.close();
        return mang;
    }
    public static void XuatMang (List<Integer>[] mang)
    {
        for (int i=0;i<mang.length;i++)
        {
            System.out.print(mang[i]);
        }
    }
    public static List<Integer>[] SapXepMang (List<Integer>[] mang)
    {
        for (int i=0;i<mang.length;i++)
        {
            for (int j=i+1;j<mang.length;j++)
            {
                if (TBC(mang[i])<TBC(mang[j]))
                {
                    List<Integer> x = mang[i];
                    mang[i]=mang[j];
                    mang[j]=x;
                }
            }
        }
        return mang;
    }
    public static double TBC (List<Integer> list)
    {
        int tbc,tong=0,n=list.size();
        for (Integer integer : list) {
            tong += integer;
        }
        tbc=tong/n;
        return tbc;
    }
}
