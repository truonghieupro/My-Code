package JavaCore;
import java.util.Calendar;
public class JA1_9_01 {
    public static void main(String[] args) {
        Calendar lich = Calendar.getInstance();
        System.out.println(lich.getTime());
        System.out.println(lich.get(Calendar.DAY_OF_MONTH)+"\n"+ (lich.get(Calendar.MONTH)+1)+"\n"+ lich.get(Calendar.YEAR));
    }
}
