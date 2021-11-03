package JavaCollection;
import java.util.*;
public class JA2_4_04 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        map.remove(1);
        System.out.println(map);
    }
}
