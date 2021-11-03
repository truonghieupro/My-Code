package OOP;

import java.util.ArrayList;
import java.util.List;

public class OOP_20 {
    public static void main(String[] args) {
        List<TapChi> list = new ArrayList<TapChi>();
        TapChi tc1 = new TapChi();
        tc1.NhapTC();
        list.add(tc1);
        TapChi tc2 = new TapChi();
        tc1.NhapTC();
        list.add(tc2);
        TapChi tc3 = new TapChi();
        tc1.NhapTC();
        list.add(tc3);
        TapChi tc4 = new TapChi();
        tc1.NhapTC();
        list.add(tc4);
        TapChi.TimKiem(list,"ki thuat").forEach(x->{x.InTT();});
    }
}
