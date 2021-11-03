package OOP;

import java.util.Map;
import java.util.Scanner;

public class PhanSo {
    private int TuSo,MauSo;

    public int getTuSo() {
        return TuSo;
    }

    public void setTuSo(int tuSo) {
        TuSo = tuSo;
    }

    public int getMauSo() {
        return MauSo;
    }

    public void setMauSo(int mauSo) {
        MauSo = mauSo;
    }
    private PhanSo ToiGian()
    {
        if (MauSo==0) return null;
        int tu = TuSo, mau = MauSo;
        while (Math.abs(tu) != Math.abs(mau))
        {
            if (Math.abs(tu)>Math.abs(mau)) tu = Math.abs(tu) - Math.abs(mau);
            else mau = Math.abs(mau) - Math.abs(tu);
        }
        return new PhanSo(TuSo/tu,MauSo/tu);
    }
    public PhanSo (int tu,int mau)
    {
        setTuSo(tu);
        setMauSo(mau);
    }
    public static PhanSo Cong (PhanSo one,PhanSo two)
    {
        return (new PhanSo(two.getTuSo()* one.getMauSo()+two.getMauSo()*one.getTuSo(),one.getMauSo()*two.getMauSo())).ToiGian();
    }
    public static PhanSo Tru (PhanSo one,PhanSo two)
    {
        return (new PhanSo(two.TuSo* one.MauSo-two.MauSo*one.TuSo,one.MauSo*two.MauSo)).ToiGian();
    }
    public void InThongTin()
    {
        System.out.println(TuSo+"/"+MauSo);
    }
    private Scanner sc = new Scanner(System.in);
    public PhanSo()
    {
        System.out.println("nhap tu so, mau so");
        setTuSo(sc.nextInt());
        setMauSo(sc.nextInt());
    }
}
