package OOP;

public class OOP_19 {
    public static void main(String[] args) {
        BinhLinh linh = new BinhLinh("linh",true);
        linh.InThongTin();
        CungThu cung = new CungThu("cung thu",true);
        cung.InThongTin();
        KiemSi kiem = new KiemSi("kiem si",true);
        kiem.InThongTin();
        DauSi dausi = new DauSi("dau si",true);
        dausi.InThongTin();
        BinhLinh.ChienDau(linh,cung);
    }
}
