package OOP;

import java.time.LocalDate;

public class OOP_11 {
    public static void main(String[] args) {
        DonDatHang one = new DonDatHang();
        one.InThongTin();
        DonDatHang two = new DonDatHang(01, LocalDate.parse("2021-09-22"),"Sua Chua",15000,2,"rat tot cho he tieu hoa");
        two.InThongTin();
    }
}
