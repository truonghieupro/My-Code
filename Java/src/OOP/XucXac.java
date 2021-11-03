package OOP;

import java.util.Random;
import java.util.Scanner;

public class XucXac {
    private int giatri1,giatri2;
    private Boolean thang=false,thua=false,hoa=false;

    public int getGiatri1() {
        return giatri1;
    }

    public void setGiatri1(int giatri1) {
        this.giatri1 = giatri1;
    }

    public int getGiatri2() {
        return giatri2;
    }

    public void setGiatri2(int giatri2) {
        this.giatri2 = giatri2;
        if (giatri2>giatri1) thua=true;
        else if (giatri2==giatri1) hoa=true;
        else thang=true;
    }

    public Boolean getThang() {
        return thang;
    }

    public Boolean getThua() {
        return thua;
    }

    public Boolean getHoa() {
        return hoa;
    }
    private Scanner sc = new Scanner(System.in);
    private int NhapGiaTri()
    {
        int so=0;
        Boolean ok=false;
        do {
            try
            {
                System.out.println("nhap gia tri muon cuoc");
                so = sc.nextInt();
                ok = true;

            } catch (Exception a)
            {
                System.out.println("nhap so nguyen");
                sc.nextLine();
            }
        }while (!ok);
        return so;
    }
    private void InThongTin()
    {
        if (thang) System.out.println("nguoi choi thang");
        else if (thua) System.out.println("nguoi choi thua");
        else System.out.println("nguoi choi hoa");
    }
    public void Start()
    {
        do {
            setGiatri1(NhapGiaTri());
            if (getGiatri1()<3||getGiatri1()>18) {
                System.out.println("End !");
            return; }
            Random x = new Random();
            int l1 = x.nextInt(6)+1;
            int l2 = x.nextInt(6)+1;
            int l3 = x.nextInt(6)+1;
            System.out.println("ket qua "+l1+" "+l2+" "+l3+"\nTong: "+(l1+l2+l3));
            setGiatri2(l1+l2+l3);
            InThongTin();
            thang=thua=hoa=false;
        } while (giatri2>=3||giatri2<=18);
    }
}
