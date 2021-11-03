package OOP;

import java.time.LocalDate;

public class OOP_08 {
    public static void main(String[] args) {
        HocSinh two = new HocSinh("Tran Quang Chien","12A8", LocalDate.parse("2000-05-27"),5.5,6.2,3.4);
        two.InThongTin();
    }
}
