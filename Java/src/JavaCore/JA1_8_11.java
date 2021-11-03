package JavaCore;
import java.util.Scanner;
public class JA1_8_11 {
    public static void main(String[] args) {
        String Account="nguyendongkhanh@hvitclan.vn";
        String Password="123456";
        Scanner a=new Scanner(System.in);
        System.out.println("nhap tai khoan: ");
        String Ac=a.nextLine();
        System.out.println("nhap mat khau:");
        String Ps=a.nextLine();
        int x=Ac.compareTo(Account), y=Ps.compareTo(Password);
        if (x==0&&y==0) { System.out.println("Success"); }
        else { System.out.println("Fail"); }
        a.close();
    }
}
