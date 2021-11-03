package JavaCollection;
import java.util.*;
public class JA2_3_07 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        Collections.addAll(set,"Cam", "Quyt", "Mit", "Dua", "Le", "Tao", "Oi");
        String chuoi="Hvit";
        if (set.contains(chuoi))
        {
            System.out.println("chuoi s chua trong set");
        }
        else
        {
            System.out.println("chuoi s khong chua trong set");
        }
    }
}
