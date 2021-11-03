package OOP;

public class OOP_15 {
    public static void main(String[] args) {
        DongHo one = new DongHo();
        one.LayThongTin();
        DongHo two = new DongHo(7,30,0);
        two.LayThongTin();
        DongHo.TinhKhoangThoiGian(one,two).InTT();
    }
}
