package JavaMethods;

import java.util.Scanner;

public class JA3_1_13 {
    public static void main(String[] args) {
        NhapSo();
    }
    public static void NhapSo()
    {
        Scanner x = new Scanner(System.in);
        int n; boolean check=false;
        System.out.println("nhap mot so");
        while (!check)
        {
            try
            {
                n=x.nextInt();
                if (n>1 && n<100)
                {
                    check=true;
                    System.out.println("so vua nhap la "+n);
                }
                else
                {
                    System.out.println("sai khoang gia tri hay nhap lai");
                }
            } catch (Exception e)
            {
                System.out.println("sai kieu du lieu hay nhap lai");
                x.nextLine();
            }
        }
        x.close();
    }
}
