package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sach1 extends  TaiLieu{
    private String tensach,tentacgia;
    private int sotrang;
    private Scanner sc = new Scanner(System.in);

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }
    public void NhapSach()
    {
        Nhap();
        System.out.println("nhap ten sach,ten tac gia,so trang");
        setTensach(sc.nextLine());
        setTentacgia(sc.nextLine());
        setSotrang(sc.nextInt());
    }
    public void InThongTin()
    {
        In();
        System.out.println("ten sach "+tensach+"\nten tac gia: "+tentacgia+"\nsotrang: "+sotrang);
    }
    public static List<Sach1> TimKiem (List<Sach1> input,String tencantim)
    {
        List<Sach1> list = new ArrayList<Sach1>();
        input.forEach(x->{if (x.getTensach().contains(tencantim)) list.add(x);});
        return list;
    }
}
