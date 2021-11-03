package JavaCore;
import java.util.Scanner;
public class JA1_8_10
{
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("nhap vao mot chuoi");
        String a=x.nextLine();
        String e=a.toLowerCase();
        char b='s',c='t'; int dem1=0,dem2=0;
        for (int i=0;i<e.length();i++)
        {
            if (e.charAt(i)==b) { dem1++; }
        }
        for (int i=0;i<e.length();i++)
        {
            if (e.charAt(i)==c) { dem2++; }
        }
        System.out.println(dem1);
        System.out.println(dem2);
        if (dem1>dem2||dem1==dem2) {
            System.out.println("AA"); }
        else if (dem1<dem2) {
            System.out.println("AM");
        }
        x.close();
    }
}
