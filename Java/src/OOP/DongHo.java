package OOP;

import java.util.Scanner;

public class DongHo {
    private int gio,phut,giay;
    private Boolean LaBuoiSang;

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }

    public Boolean getLaBuoiSang() {
        return LaBuoiSang;
    }

    private Boolean setLaBuoiSang() {
        if (gio >= 6 && gio <=12) return LaBuoiSang=true;
        return LaBuoiSang=false;
    }
    private Scanner sc = new Scanner(System.in);
    private int Nhap (String nhap,String Error,int min,int max)
    {
        Boolean ok = false;
        int so=0;
        do {
            try {
                System.out.println(nhap);
                so = sc.nextInt();
                ok = true;
                ok = ok && so >= min && so <=max;

            }catch (Exception e)
            {
                System.out.println(Error);
                sc.nextLine();
            }
        } while (!ok);
        return so;
    }
    public DongHo ()
    {
        setGio(Nhap("nhap gio","loi hay nhap lai",0,24));
        setPhut(Nhap("nhap phut","loi hay nhap lai",0,59));
        setGiay(Nhap("nhap giay","loi hay nhap lai",0,59));
    }
    public DongHo (int hour,int minutes,int seconds)
    {
        gio=hour;
        phut=minutes;
        giay=seconds;
    }
    public static DongHo TinhKhoangThoiGian (DongHo one, DongHo two)
    {
        int s = Math.abs(one.gio*3600 +one.phut*60 +one.giay - two.gio*3600 -two.phut*60 -two.giay) ;
        return new DongHo( s/3600,(s%3600)/60,(s%3600)%60 );
    }
    public void LayThongTin()
    {
        setLaBuoiSang();
        System.out.print(gio+":"+phut+":"+giay);
        if (LaBuoiSang == true) System.out.println(" bay gio dang la buoi sang");
        if (LaBuoiSang == false && gio > 18 && gio <=24 || gio>=0 && gio<6) System.out.println(" bay gio dang la buoi toi");
        if (LaBuoiSang == false && gio >= 12 && gio <= 18) System.out.println(" bay gio dang la buoi chieu");
    }
    public void InTT()
    {
        System.out.print(gio+":"+phut+":"+giay);
    }
}
