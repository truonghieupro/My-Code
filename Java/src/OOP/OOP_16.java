package OOP;

public class OOP_16 {
    public static void main(String[] args) {
        ThoiGian one = new ThoiGian();
        one.InThongTin();
        ThoiGian two = new ThoiGian(2021,05,10);
        two.InThongTin();
        System.out.println(ThoiGian.LayKhoangThoiGian(one,two));
    }
}
