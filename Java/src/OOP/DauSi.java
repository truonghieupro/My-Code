package OOP;

public class DauSi extends BinhLinh{
    public DauSi(String Ten, Boolean Trangbi) {
        super(Ten, Trangbi);
    }

    protected int TinhSucManh()
    {
        return trangbi?sucmanh*=1.7:sucmanh;
    }
}
