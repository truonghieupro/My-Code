package JavaCore;
public class JA1_8_06 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Hello Java ,Hello HvitClan");
        System.out.println("string buffer = " + a);
        int index= a.indexOf("Hello"),lastindex=a.lastIndexOf("Hello");
        a.delete(index,lastindex);
        System.out.println("After deletion string buffer is = " + a);
    }
}
