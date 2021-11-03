package OOP;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ThoiGian {
    private int thu,ngay,thang,nam;
    private Boolean LaNamNhuan = false;
    Calendar lich = GregorianCalendar.getInstance();
    public int getThu() {
        return thu;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
        lich.set(nam,thang-1,ngay);
        thu = lich.get(Calendar.DAY_OF_WEEK);
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
        if (this.nam % 4 ==0 && this.nam % 100 != 0 || this.nam % 400 == 0) LaNamNhuan = true;
        else LaNamNhuan = false;
    }

    public Boolean getLaNamNhuan() {
        return LaNamNhuan;
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
    public ThoiGian(int nam,int thang,int ngay)
    {
        setNam(nam);
        setThang(thang);
        setNgay(ngay);
    }
    public ThoiGian()
    {
        setNam(Nhap("nhap nam","loi, hay nhap lai",1000,lich.get(Calendar.YEAR)));
        setThang(Nhap("nhap thang","loi,hay nhap lai",1,12));
        if (thang==2)
        {
            if (LaNamNhuan) setNgay(Nhap("nhap ngay","loi hay nhap lai",1,29));
            else setNgay(Nhap("nhap ngay","loi hay nhap lai",1,28));
        }
        else if (thang==4||thang==6||thang==9||thang==11)
            setNgay(Nhap("nhap ngay","loi hay nhap lai",1,30));
        else setNgay(Nhap("nhap ngay","loi hay nhap lai",1,31));
    }
    public static long LayKhoangThoiGian(ThoiGian one,ThoiGian two)
    {
        Calendar l1 = Calendar.getInstance();
        Calendar l2 = Calendar.getInstance();
        l1.set(one.getNam(),one.getThang()-1,one.getNgay());
        l2.set(two.getNam(),two.getThang()-1,two.getNgay());
        long n = ((l1.getTimeInMillis() - l2.getTimeInMillis())/(24*60*60*1000));
        return n;
    }
    public void InThongTin()
    {
        System.out.println("Thu "+thu+" ngay "+ngay+"/"+thang+"/"+nam+", "+LaNamNhuan+" la nam nhuan");
    }

}
