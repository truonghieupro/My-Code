package OOP;

import java.time.LocalDate;
import java.util.Scanner;

public class Sach {
    private String TenSach,TheLoai,TacGia;
    private int Gia;
    private LocalDate NgayThang;

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String theLoai) {
        TheLoai = theLoai;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    public LocalDate getNgayThang() {
        return NgayThang;
    }

    public void setNgayThang(LocalDate ngayThang) {
        NgayThang = ngayThang;
    }
    private Scanner sc = new Scanner(System.in);
    public Sach()
    {
        System.out.println("nhap Ten Sach, The Loai,Tac Gia, Gia, Ngay Xuat Ban");
        TenSach = sc.nextLine();
        TheLoai = sc.nextLine();
        TacGia = sc.nextLine();
        Gia = sc.nextInt();
        sc.nextLine();
        NgayThang = LocalDate.parse(sc.nextLine());
    }
    public void InThongTin()
    {
        System.out.println(TenSach+" la Sach "+TheLoai+" co gia: "+Gia+" xuat ban ngay "+NgayThang+" viet boi "+TacGia);
    }
}
