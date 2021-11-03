package OOP;

import java.time.LocalDate;
import java.util.Scanner;

public class Nguoi {
    private int maso;
    private String hoten,ho,dem,ten;
    private LocalDate ngaysinh;

    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getHo() {
        return ho;
    }

    private void setHo(String ho) {
        String[] a = hoten.split("");
        this.ho = a[0];
    }

    public String getDem() {
        return dem;
    }

    private void setDem(String dem) {
        String[] a = hoten.split("");
        dem = "";
        for (int i=1;i<a.length-1;i++)
        {
            dem+=a[i]+" ";
        }
        this.dem=dem;
    }

    public String getTen() {
        return ten;
    }

    private void setTen(String ten) {
        String[] a = hoten.split("");
        this.ten = a[a.length-1];
    }

    public LocalDate getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(LocalDate ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    private String TaoDuLieuHoTen(String ht)
    {
        if (hoten==null||ht.compareTo(hoten) != 0) return ht;
        return hoten;
    }

    private Scanner sc = new Scanner(System.in);
    public Nguoi()
    {
        System.out.println("nhap ma so, ho ten, ngay sinh");
        maso = sc.nextInt();
        sc.nextLine();
        hoten = TaoDuLieuHoTen(sc.nextLine());
        ngaysinh = LocalDate.parse(sc.nextLine());
    }
    public Nguoi(int ma,String ht,LocalDate Ngaysinh)
    {
        maso = ma;
        hoten = TaoDuLieuHoTen(ht);
        ngaysinh = Ngaysinh;
    }
    public void InThongTin ()
    {
        System.out.println(maso+" co ten la "+hoten+" sinh ngay "+ngaysinh);
    }
}
