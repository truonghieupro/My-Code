package OOP;

import java.util.Scanner;

public class SoThuc {
    private double giatri;
    private boolean lasoduong;

    public double getGiatri() {
        return giatri;
    }

    public void setGiatri(double giatri) {
        this.giatri = giatri;
    }

    public boolean getLasoduong() {
        setLasoduong();
        return lasoduong;
    }

    private void setLasoduong() {
        if (giatri>0) lasoduong=true;
        else lasoduong = false;
    }
    private Scanner sc = new Scanner(System.in);
    public SoThuc()
    {
        System.out.println("nhap gia tri");
        giatri = sc.nextDouble();
    }
    public static SoThuc TimMax (SoThuc a,SoThuc b,SoThuc c)
    {
        if (a.getGiatri()>=b.getGiatri() && a.getGiatri()>=c.getGiatri()) return a;
        if (b.getGiatri()>=a.getGiatri() && b.getGiatri()>=c.getGiatri()) return b;
        return c;
    }
    public double TinhCanBacN (int n)
    {
        return Math.pow(giatri,1./n);
    }
}
