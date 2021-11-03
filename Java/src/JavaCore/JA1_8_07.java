package JavaCore;
public class JA1_8_07 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Hello HvitClan");
        StringBuffer b=a.reverse();
        int j=b.compareTo(a);
        if (j==0) { System.out.println(b); }
        else {
            StringBuffer c = a.append(b);
            System.out.println(c);
        }
    }
}
