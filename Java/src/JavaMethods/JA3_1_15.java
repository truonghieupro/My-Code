package JavaMethods;

import java.util.Scanner;

public class JA3_1_15 {
    public static void main(String[] args) {
        Hien(Nhap());
    }
    public static String Nhap ()
    {
        Scanner x=new Scanner(System.in);
        System.out.println("nhap vao mot chuoi: ");
        String a = x.nextLine();
        x.close();
        return a;
    }
    public static void Hien (String a)
    {
        System.out.println("chuoi da nhap la: "+a);
    }
}
