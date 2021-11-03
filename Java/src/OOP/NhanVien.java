package OOP;

import java.util.Scanner;

public class NhanVien {
    private int maNV;
    private String HoVaTen,PhongBan,DiaChi,SDT;

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        HoVaTen = hoVaTen;
    }

    public String getPhongBan() {
        return PhongBan;
    }

    public void setPhongBan(String phongBan) {
        PhongBan = phongBan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    private Scanner sc = new Scanner(System.in);
    public NhanVien()
    {
        System.out.println("nhap ma nhan vien,ho va ten,phong ban,dia chi,sdt :");
        maNV = sc.nextInt();
        sc.nextLine();
        HoVaTen = sc.nextLine();
        PhongBan = sc.nextLine();
        DiaChi = sc.nextLine();
        SDT = sc.nextLine();
    }
    public void InThongTin()
    {
        System.out.println("nhan vien "+HoVaTen+" thuoc phong ban "+PhongBan+" co so dien thoai la "+SDT);
    }

}
