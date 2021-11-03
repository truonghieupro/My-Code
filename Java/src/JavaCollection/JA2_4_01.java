package JavaCollection;
import java.util.*;
public class JA2_4_01 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("Viet Nam","Ha Noi");
        map.put("Hoa Ky","Washington,D.C");
        map.put("Han Quoc","Seoul");
        Iterator<Map.Entry<String,String>> a=map.entrySet().iterator();
        while (a.hasNext())
        {
            Map.Entry<String,String> b=a.next();
            System.out.println(b.getValue()+" la thu do cua "+b.getKey()+" ,");
        }
    }
}
