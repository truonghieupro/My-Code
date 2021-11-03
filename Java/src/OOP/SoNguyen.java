package OOP;

import java.util.Scanner;

public class SoNguyen {
    private int So;
    private Boolean LaSoChan,LaSoNguyenTo,LaSoDoiXung;

    public int getSoNguyen() {
        return So;
    }

    public void setSoNguyen(int soNguyen) {
        So = soNguyen;
        LaSoChan = setLaSoChan();
        LaSoNguyenTo = setLaSoNguyenTo();
        LaSoDoiXung = setLaSoDoiXung();
    }

    public Boolean getLaSoChan() {
        return LaSoChan;
    }

    private  Boolean setLaSoChan() {
        if (So%2==0) return true;
        return false;
    }

    public Boolean getLaSoNguyenTo() {
        return LaSoNguyenTo;
    }

    public Boolean setLaSoNguyenTo() {
        if (So<2) return false;
        if (So==2) return true;
        for (int i = 3;i<=Math.sqrt(So);i+=2)
        {
            if (So % i == 0) return false;
        }
        return true;
    }

    public Boolean getLaSoDoiXung() {
        return LaSoDoiXung;
    }

    public Boolean setLaSoDoiXung() {
        char[] a = String.valueOf(So).toCharArray();
        for (int i=0;i<a.length;i++)
        {
            if (a[i]!=a[a.length-1-i]) return false;
        }
        return true;
    }
    private Scanner sc = new Scanner(System.in);
    public SoNguyen()
    {
        setSoNguyen(NhapSo("nhap mot so","Loi Hay Nhap Lai"));
    }
    public SoNguyen(int n)
    {
        setSoNguyen(n);
    }
    public SoNguyen Cong (SoNguyen n)
    {
        return new SoNguyen(So + n.getSoNguyen());
    }
    public void InThongTin()
    {
        System.out.println("So "+So+" "+LaSoChan+" la so chan "+LaSoNguyenTo+" la so nguyen to "+LaSoDoiXung+" la so doi xung");
    }
    private int NhapSo (String nhap,String error)
    {
        Boolean ok = false;
        int so=0;
        do {
            try {
                System.out.println(nhap);
                so = sc.nextInt();
                ok = true;

            }catch (Exception e)
            {
                System.out.println(error);
                sc.nextLine();
            }
        } while (!ok);
        return so;
    }
}
