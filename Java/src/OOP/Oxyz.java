package OOP;

import java.util.Scanner;

public class Oxyz {
    private double X,Y,Z;

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public double getZ() {
        return Z;
    }

    public void setZ(double z) {
        Z = z;
    }
    private Scanner sc = new Scanner(System.in);
    public Oxyz()
    {
        System.out.println("nhap toa do thu nhat,toa do thu hai,toa do thu ba");
        X = sc.nextDouble();
        Y = sc.nextDouble();
        Z = sc.nextDouble();
    }
    public Oxyz (double x, double y, double z)
    {
        X = x;
        Y = y;
        Z = z;
    }
    public void InThongTin()
    {
        System.out.println("("+X+", "+Y+", "+Z+")");
    }
    public static double TinhKhoangCach (Oxyz diem1, Oxyz diem2)
    {
        return Math.sqrt(Math.pow((diem1.getX()-diem2.getX()),2)+Math.pow((diem1.getY()-diem2.getY()),2)+Math.pow((diem1.getZ()-diem2.getZ()),2));
    }
}
