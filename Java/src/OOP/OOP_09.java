package OOP;

public class OOP_09 {
    public static void main(String[] args) {
        Oxyz diem1 = new Oxyz();
        diem1.InThongTin();
        Oxyz diem2 = new Oxyz(4,5,6);
        System.out.println(Oxyz.TinhKhoangCach(diem1,diem2));
    }
}
