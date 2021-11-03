package JavaMethods;

import java.util.Scanner;

public class JA3_1_04 {
    public static void main(String[] args) {
        NhapSoNguyen();
    }
    public static int NhapSoNguyen()
    {
        Scanner a = new Scanner(System.in);
        int n=0; boolean check=false;
        System.out.println("nhap vao mot so: ");
        while (!check)
        {
            try
            {
                n=a.nextInt();
                check=true;
            }
            catch (Exception e)
            {
                System.out.println("nhap sai kieu du lieu ! hay nhap lai");
                a.nextLine();
            }
        }
        a.close();
        return n;
    }
}
