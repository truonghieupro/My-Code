package JavaMethods;

import java.util.Scanner;

public class JA3_1_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap vao mot chuoi");
        String a = in.nextLine();
        System.out.println("ki tu o giua chuoi la: "+TimKiTuGiua(a));
        in.close();
    }
    public static String TimKiTuGiua(String a)
    {
        int vitri,dodai;
        if (a.length()%2==0)
        {
            vitri=a.length()/2-1;
            dodai=2;
        } else
        {
            vitri=a.length()/2;
            dodai=1;
        }
        return a.substring(vitri,vitri+dodai);
    }
}
