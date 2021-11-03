package OOP;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;

public class DonDatHang {
    private int MaSoDon;
    private LocalDate NgayDat;
    private String TenSanPham,GhiChu;
    private double DonGia,ThanhTien;
    private int SoLuong;

    public int getMaSoDon() {
        return MaSoDon;
    }

    public void setMaSoDon(int maSoDon) {
        MaSoDon = maSoDon;
    }

    public LocalDate getNgayDat() {
        return NgayDat;
    }

    public void setNgayDat(LocalDate ngayDat) {
        NgayDat = ngayDat;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String ghiChu) {
        GhiChu = ghiChu;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double donGia) {
        DonGia = donGia;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    private void setThanhTien() {
        ThanhTien = DonGia*SoLuong;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }
    private Scanner sc = new Scanner(System.in);

    public DonDatHang()
    {
        System.out.println("nhap ma so don hang,ngay dat hang,ten san pham,gia ban,so luong,ghi chu");
        MaSoDon = sc.nextInt();
        sc.nextLine();
        NgayDat = LocalDate.parse(sc.nextLine());
        TenSanPham = sc.nextLine();
        DonGia = sc.nextDouble();
        SoLuong = sc.nextInt();
        sc.nextLine();
        GhiChu = sc.nextLine();
    }
    public DonDatHang (int maso,LocalDate ngaydathang,String ten,double gia,int soluong,String note)
    {
        MaSoDon = maso;
        NgayDat = ngaydathang;
        TenSanPham = ten;
        DonGia = gia;
        SoLuong = soluong;
        GhiChu = note;
    }
    public void InThongTin()
    {
        setThanhTien();
        System.out.println("Don hang co so "+MaSoDon+" dat ngay "+NgayDat+" co tong tien la "+ThanhTien);
    }
}
