package OOP;

import java.util.Scanner;

public class MonAn {
    private String ten,gioithieu,nguyenlieu;
    private int gia;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioithieu() {
        return gioithieu;
    }

    public void setGioithieu(String gioithieu) {
        this.gioithieu = gioithieu;
    }

    public String getNguyenlieu() {
        return nguyenlieu;
    }

    public void setNguyenlieu(String nguyenlieu) {
        this.nguyenlieu = nguyenlieu;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    private Scanner sc = new Scanner(System.in);

    public MonAn()
    {
        System.out.println("nhap ten mon,gia ban, gioi thieu, nguyen lieu chinh");
        ten = sc.nextLine();
        gia = sc.nextInt();
        sc.nextLine();
        gioithieu = sc.nextLine();
        nguyenlieu = sc.nextLine();
    }
    public void InThongTin()
    {
        System.out.println(ten+","+gioithieu+",duoc lam tu "+nguyenlieu);
    }
}
