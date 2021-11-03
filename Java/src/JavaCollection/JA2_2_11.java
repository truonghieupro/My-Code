package JavaCollection;
import java.util.*;
public class JA2_2_11 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList( "Cam", "Quyt", "Mit", "Dua", "Dua", "Le", "Tao", "Oi"));
        Collections.sort(list);
        System.out.println(list);
    }
}
