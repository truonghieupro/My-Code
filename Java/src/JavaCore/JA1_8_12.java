package JavaCore;
import java.util.Scanner;
public class JA1_8_12 {
    public static void main(String[] args) {
        Scanner q=new Scanner(System.in);
        System.out.println("nhap ho ten");
        String a=q.nextLine();
        a = a.replaceAll(" ","");
        String b=a.toLowerCase();
        String c=b.concat("@hvitclan.vn");
        System.out.println(c);
        q.close();
    }
}
