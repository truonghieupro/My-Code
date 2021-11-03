package JavaCore;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class JA1_9_02 {
    public static void main(String[] args) {
        Calendar a=Calendar.getInstance();
        SimpleDateFormat b=new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
        String c=b.format(a.getTime());
        System.out.println(c);
    }
}
