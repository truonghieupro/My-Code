package JavaCollection;
import java.util.*;
public class JA2_2_02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Toan", "Ly", "Hoa", "Van", "Anh", "Toan Cao Cap", "Sinh Hoa"));
        String[] a=list.toArray(new String[0]);
        for (String s : a) {
            System.out.print(s + ",");
        }
    }
}
