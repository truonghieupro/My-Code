package JavaCore;
import java.util.Scanner;
public class JA1_8_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao mot chuoi: ");
        String a=sc.nextLine();
        int chucai=0,chuso=0,kitu=0;
        for(int i=0;i<a.length();i++){
            if(Character.isLetter(a.charAt(i))) chucai++;
            else if(Character.isDigit(a.charAt(i))) chuso++;
            else { kitu++; }
        }
        System.out.println("Chuoi "+a+" co "+chucai+" chu cai "+chuso+" chu so "+kitu+" kitu");
        sc.close();
    }
}
