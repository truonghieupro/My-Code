package JavaCore;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class JA1_9_04 {
    public static void main(String[] args) {
        String hoten="nguyen van a";
        int ngay=5,thang=1,nam=1980;
        Calendar birthday=new GregorianCalendar(nam,thang,ngay);
        System.out.println(birthday.getTime());
        birthday.add(Calendar.YEAR,60);
        System.out.println(hoten+" se ve huu vao "+birthday.getTime());
    }
}
