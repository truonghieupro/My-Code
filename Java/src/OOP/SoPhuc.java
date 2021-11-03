package OOP;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }
    public void InThongTin()
    {
        System.out.println(phanThuc+"+"+phanAo+"i");
    }
}
