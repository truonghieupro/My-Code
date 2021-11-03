package OOP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruyenTranh extends TaiLieu {
    private String tentruyen;
    private LocalDate ngayphathanh;
    private Scanner sc = new Scanner(System.in);

    public String getTentruyen() {
        return tentruyen;
    }

    public void setTentruyen(String tentruyen) {
        this.tentruyen = tentruyen;
    }

    public LocalDate getNgayphathanh() {
        return ngayphathanh;
    }

    public void setNgayphathanh(LocalDate ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
    }
    public void NhapTT()
    {
        Nhap();
        System.out.println("nhap ten truyen va ngay phat hanh");
        setTentruyen(sc.nextLine());
        setNgayphathanh(LocalDate.parse(sc.nextLine()));
    }
    public void InTT()
    {
        In();
        System.out.println("ten truyen "+tentruyen+"\nngay phat hanh: "+ngayphathanh);
    }
    public static List<TruyenTranh> TimKiem (List<TruyenTranh> input, String tencantim)
    {
        List<TruyenTranh> list = new ArrayList<TruyenTranh>();
        input.forEach(x->{if (x.getTentruyen().contains(tencantim)) list.add(x);});
        return list;
    }
}
