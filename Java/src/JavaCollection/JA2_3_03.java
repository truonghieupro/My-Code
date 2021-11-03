package JavaCollection;
import java.util.*;
public class JA2_3_03 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        Collections.addAll(set,"Cam", "Quyt", "Mit", "Dua", "Le", "Tao", "Oi");
        if (set.isEmpty()==true)
        {
            System.out.println("Set Rong");
        }
        else
        {
            System.out.println("Set co phan tu");
        }
    }
}
