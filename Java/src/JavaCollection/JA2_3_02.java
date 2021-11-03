package JavaCollection;
import java.util.*;
public class JA2_3_02 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        Collections.addAll(set,"One","Two","Three","Three","Three");
        System.out.println(set);
    }
}
