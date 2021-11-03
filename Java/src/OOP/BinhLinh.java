package OOP;

public class BinhLinh {
    protected String ten;
    protected int sucmanh=50;
    protected boolean trangbi = false;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSucmanh() {
        return sucmanh;
    }

    public boolean isTrangbi() {
        return trangbi;
    }

    public void setTrangbi(boolean trangbi) {
        this.trangbi = trangbi;
        sucmanh=TinhSucManh();
    }
    protected int TinhSucManh()
    {
        return trangbi?sucmanh*=1.1:sucmanh;
    }
    public void InThongTin()
    {
        System.out.println(ten+" co suc manh la "+sucmanh);
    }
    public static void ChienDau (BinhLinh one,BinhLinh two)
    {
        if (one.sucmanh > two.sucmanh) System.out.println(one.getTen()+" thang "+two.getTen());
        else if (one.sucmanh == two.sucmanh) System.out.println(one.getTen()+" hoa "+two.getTen());
        else System.out.println(one.getTen()+" thua "+two.getTen());
    }
    public BinhLinh (String Ten,Boolean Trangbi)
    {
        ten=Ten;
        setTrangbi(Trangbi);
    }

}
