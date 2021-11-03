package OOP;

public class SanPham {
    private int maSanPham;
    private String tenSanPham,loaiSanPham;
    private Boolean laSanPhamMoi;

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public Boolean getLaSanPhamMoi() {
        return laSanPhamMoi;
    }

    public void setLaSanPhamMoi(Boolean laSanPhamMoi) {
        this.laSanPhamMoi = laSanPhamMoi;
    }
    public SanPham (int msp,String tsp,String lsp,Boolean lspm)
    {
        maSanPham=msp;
        tenSanPham=tsp;
        loaiSanPham=lsp;
        laSanPhamMoi=lspm;
    }
    public void InThongTin ()
    {
        System.out.println("san pham "+tenSanPham+" thuoc loai "+loaiSanPham+", "+laSanPhamMoi+" la san pham moi");
    }
}
