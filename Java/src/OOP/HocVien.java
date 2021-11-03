package OOP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HocVien {
    private int MaHocVien;
    private String HoTen,Ho,Email;
    private LocalDate NgaySinh;
    private double HocPhi;

    public int getMaHocVien() {
        return MaHocVien;
    }

    public void setMaHocVien(int maHocVien) {
        MaHocVien = maHocVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getHo() {
        return Ho;
    }

    private void setHo() {
        String[] a = HoTen.split("");
        Ho=a[0];
    }

    public String getEmail() {
        return Email;
    }

    private void setEmail() {
        String[] a = HoTen.split(" ");
        Email=a[a.length-1].toLowerCase().concat("@edusolution.com");
    }

    public LocalDate getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public double getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(double hocPhi) {
        if (hocPhi > 3000000)
            HocPhi = hocPhi - (hocPhi/100)*5;
        else HocPhi = hocPhi;
    }
    private Scanner sc = new Scanner(System.in);
    public HocVien ()
    {
        System.out.println("nhap ma hoc vien,ho ten,ngay sinh");
        MaHocVien = sc.nextInt();
        sc.nextLine();
        HoTen = sc.nextLine();
        NgaySinh = LocalDate.parse(sc.nextLine());
    }
    public HocVien (int ma,String hovaten,LocalDate ngaysinh)
    {
        MaHocVien = ma;
        HoTen = hovaten;
        NgaySinh = ngaysinh;
    }
    public static List<HocVien> TimKiemHocVien (List<HocVien> input)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten hoc vien can tim");
        String ten = sc.nextLine();
        List<HocVien> list = new ArrayList<>();
        for (HocVien i : input)
            if (i.getHoTen().contains(ten)) list.add(i);
            return list;
    }
    public void InThongTin()
    {
        setEmail();
        System.out.println(MaHocVien+" co ten "+HoTen+" co email la "+Email);
    }
}
