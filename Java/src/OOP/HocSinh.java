package OOP;

import java.time.LocalDate;
import java.util.Scanner;

public class HocSinh {
    private String Hoten,Lop;
    private LocalDate ngaysinh;
    double diemtoan,diemvan,diemanh,diemtb;

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        this.Hoten = hoten;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        this.Lop = lop;
    }

    public LocalDate getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(LocalDate ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public double getDiemtoan() {
        return diemtoan;
    }

    public void setDiemtoan(double diemtoan) {
        this.diemtoan = diemtoan;
    }

    public double getDiemvan() {
        return diemvan;
    }

    public void setDiemvan(double diemvan) {
        this.diemvan = diemvan;
    }

    public double getDiemanh() {
        return diemanh;
    }

    public void setDiemanh(double diemanh) {
        this.diemanh = diemanh;
    }

    public double getDiemtb() {
        return diemtb;
    }

    private void setDiemtb() {
        diemtb=(diemtoan+diemvan+diemanh)/3;
    }
    private Scanner sc = new Scanner(System.in);
    public HocSinh()
    {
        System.out.println("nhap ho ten,lop,ngay sinh,diem toan,diem van,diem anh");
        Hoten = sc.nextLine();
        Lop = sc.nextLine();
        ngaysinh = LocalDate.parse(sc.nextLine());
        diemtoan = sc.nextDouble();
        diemvan = sc.nextDouble();
        diemanh = sc.nextDouble();
    }
    public HocSinh (String hoten, String lop, LocalDate ngay,double toan, double van,double anh)
    {
        Hoten = hoten;
        Lop = lop;
        ngaysinh = ngay;
        diemtoan = toan;
        diemvan = van;
        diemanh = anh;
    }
    public void InThongTin()
    {
        setDiemtb();
        System.out.println(Hoten+" hoc lop "+Lop+" co diem trung binh la "+diemtb);
    }
}
