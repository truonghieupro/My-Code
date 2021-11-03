package OOP;

public class OOP_17 {
    public static void main(String[] args) {
      MaTran one = new MaTran(2,3,new int[][]{{ 1, 2, 3 }, { 4, 5, 6 }});
      one.InThongTin();
      MaTran two = new MaTran();
      one.Cong(two).InThongTin();
    }
}
