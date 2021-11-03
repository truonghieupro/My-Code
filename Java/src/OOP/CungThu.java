package OOP;

public class CungThu extends BinhLinh{
    public CungThu(String Ten, Boolean Trangbi) {
        super(Ten, Trangbi);
    }

    protected int TinhSucManh()
    {
        return trangbi?sucmanh*=1.3:sucmanh;
    }

}
