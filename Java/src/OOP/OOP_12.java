package OOP;

import java.util.ArrayList;
import java.util.List;

public class OOP_12 {
    public static void main(String[] args) {
        HocVien one = new HocVien();
        one.InThongTin();
        List<HocVien> input = new ArrayList<>();
        input.add(new HocVien());
        input.add(new HocVien());
        input.add(new HocVien());
        List<HocVien> output = HocVien.TimKiemHocVien(input);
        for ( HocVien i : output)
        {
            i.InThongTin();
        }
    }
}
