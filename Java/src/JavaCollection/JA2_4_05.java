package JavaCollection;
import java.util.*;
public class JA2_4_05 {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(5,"O");
        map.put(2,"A");
        map.put(3,"S");
        map.put(1,"Y");
        map.put(4,"U");
        for (Map.Entry<Integer,String> a : map.entrySet())
        {
            System.out.println(a.getKey()+","+a.getValue());
        }
    }
}
