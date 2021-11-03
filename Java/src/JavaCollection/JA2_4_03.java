package JavaCollection;
import java.util.*;
public class JA2_4_03 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        if (map.containsKey(4))
        {
            System.out.println("chua key = 4");
        }
        else
        {
            System.out.println("khong chua key = 4");
        }
    }
}
