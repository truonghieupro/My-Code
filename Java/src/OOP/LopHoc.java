package OOP;

import java.util.Scanner;

public class LopHoc {
    private int MaLop;
    private String TenLop;
    private int SiSo;
    private String DiaChi,GVCN;

    public int getMaLop() {
        return MaLop;
    }

    public void setMaLop(int maLop) {
        MaLop = maLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String tenLop) {
        TenLop = tenLop;
    }

    public int getSiSo() {
        return SiSo;
    }

    public void setSiSo(int siSo) {
        SiSo = siSo;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getGVCN() {
        return GVCN;
    }

    public void setGVCN(String GVCN) {
        this.GVCN = GVCN;
    }
    private Scanner sc = new Scanner(System.in);
    public LopHoc()
    {
        System.out.println("nhap ma so lop hoc, ten lop hoc, si so, dia chi, gvcn");
        MaLop = sc.nextInt();
        sc.nextLine();
        TenLop = sc.nextLine();
        SiSo = sc.nextInt();
        sc.nextLine();
        DiaChi = sc.nextLine();
        GVCN = sc.nextLine();
    }
    public LopHoc (int ma,String ten,int siso,String diachi,String gvcn)
    {
        MaLop = ma;
        TenLop = ten;
        SiSo = siso;
        DiaChi = diachi;
        GVCN = gvcn;
    }
    public void InThongTin()
    {
        System.out.println("Lop "+TenLop+" co ma la "+MaLop+" o dia chi "+DiaChi);
        System.out.println("Lop co "+SiSo+" hoc sinh va co GVCN la "+GVCN);
    }
}
