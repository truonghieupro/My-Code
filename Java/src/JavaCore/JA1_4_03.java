package JavaCore;
import java.util.Scanner;
public class JA1_4_03 {
    public static void main(String[] args)
    {
        int a;
        double giatri;
        System.out.println("nhap a: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        giatri=(Math.pow(a,2)+3*a+2);
        System.out.println("gia tri ham so la: "+giatri);
        scanner.close();
    }
}
