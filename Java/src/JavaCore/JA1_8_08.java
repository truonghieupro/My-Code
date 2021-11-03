package JavaCore;
public class JA1_8_08 {
    public static void main(String[] args) {
        String a="Nguyen  DuC TOAN";
        a = a.replaceAll(" ","");
        String b=a.toLowerCase();
        String c=b.concat("@hvitclan.vn");
        System.out.println(c);
    }
}
