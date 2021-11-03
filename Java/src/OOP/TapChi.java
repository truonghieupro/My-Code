package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TapChi extends TaiLieu {
    private String tentapchi;
    private int sophathanh,thangphathanh;
    private Scanner sc = new Scanner(System.in);

    public String getTentapchi() {
        return tentapchi;
    }

    public void setTentapchi(String tentapchi) {
        this.tentapchi = tentapchi;
    }

    public int getSophathanh() {
        return sophathanh;
    }

    public void setSophathanh(int sophathanh) {
        this.sophathanh = sophathanh;
    }

    public int getThangphathanh() {
        return thangphathanh;
    }

    public void setThangphathanh(int thangphathanh) {
        this.thangphathanh = thangphathanh;
    }
    public void NhapTC()
    {
        Nhap();
        System.out.println("nhap ten tap chi,so phat hanh, thang phat hanh");
        setTentapchi(sc.nextLine());
        setSophathanh(sc.nextInt());
        setThangphathanh(sc.nextInt());
    }
    public void InTT()
    {
        In();
        System.out.println("ten tap chi "+tentapchi+"\nso phat hanh: "+sophathanh+"\nthang phat hanh: "+thangphathanh);

    }
    public static List<TapChi> TimKiem (List<TapChi> input, String tencantim)
    {
        List<TapChi> list = new ArrayList<TapChi>();
        input.forEach(x->{if (x.getTentapchi().contains(tencantim)) list.add(x);});
        return list;
    }
}
