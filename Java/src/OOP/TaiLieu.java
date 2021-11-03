package OOP;

import java.util.List;
import java.util.Scanner;

public class TaiLieu {
    protected int matailieu,sobanphathanh;
    protected String tenNXB;
    private Scanner sc = new Scanner(System.in);

    public int getMatailieu() {
        return matailieu;
    }

    public void setMatailieu(int matailieu) {
        this.matailieu = matailieu;
    }

    public int getSobanphathanh() {
        return sobanphathanh;
    }

    public void setSobanphathanh(int sobanphathanh) {
        this.sobanphathanh = sobanphathanh;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }
    protected void Nhap()
    {
        System.out.println("nhap ma tai lieu, so ban phat hanh, ten nha xuat ban");
        setMatailieu(sc.nextInt());
        setSobanphathanh(sc.nextInt());
        sc.nextLine();
        setTenNXB(sc.nextLine());
    }
    protected void In()
    {
        System.out.println("ma tai lieu "+matailieu+"\nso ban phat hanh: "+sobanphathanh+"\n ten nha xuat ban: "+tenNXB);
    }
}
