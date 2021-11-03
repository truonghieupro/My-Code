package JavaCore;

import java.util.Scanner;

public class JA1_8_03 {
    public static void main(String[] args) {
        char m; int dem = 0;
        String a="abracadabra";
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao mot ki tu: ");
        m=sc.next().charAt(0);
        for (int i=0;i<a.length();i++)
        {
            if (a.charAt(i) == m) { dem++; }
        }
        System.out.println("Ki tu "+m+" xuat hien "+dem+" lan trong chuoi");
        sc.close();
    }
}
