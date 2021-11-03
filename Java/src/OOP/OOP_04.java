package OOP;

public class OOP_04 {
    public static void main(String[] args) {
        SoThuc so1 = new SoThuc();
        SoThuc so2 = new SoThuc();
        SoThuc so3 = new SoThuc();
        System.out.println(so1.TinhCanBacN(2));
        System.out.println(SoThuc.TimMax(so1,so2,so3).getGiatri());
    }
}
