package JavaCore;
import java.util.Calendar;
import java.util.TimeZone;
public class JA1_9_03 {
    public static void main(String[] args) {
        Calendar a=Calendar.getInstance();
        a.setTimeZone(TimeZone.getTimeZone("GMT+7"));
        System.out.println(a.get(Calendar.HOUR)+":"+a.get(Calendar.MINUTE)+":"+a.get(Calendar.SECOND));
    }
}
