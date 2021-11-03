package OOP;

public class KiemSi extends BinhLinh{
    public KiemSi(String Ten, Boolean Trangbi) {
        super(Ten, Trangbi);
    }

    protected int TinhSucManh()
    {
        return trangbi?sucmanh*=1.5:sucmanh;
    }
}
