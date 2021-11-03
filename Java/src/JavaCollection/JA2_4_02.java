package JavaCollection;
import java.util.*;
public class JA2_4_02 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Red");
        map1.put(2,"Green");
        map1.put(3,"Blue");
        Map<Integer,String> map2 = new HashMap<>();
        map2.put(4,"White");
        map2.put(5,"Black");
        map2.put(6,"Orange");
        map2.putAll(map1);
        System.out.println(map2);
    }
}
