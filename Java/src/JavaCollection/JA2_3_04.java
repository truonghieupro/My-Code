package JavaCollection;
import java.util.*;
public class JA2_3_04 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        Collections.addAll(set,"Toan", "Ly", "Hoa", "Van", "Anh", "Toan Cao Cap", "Sinh Hoa");
        set.remove("Ly");
        System.out.println(set);
    }
}
