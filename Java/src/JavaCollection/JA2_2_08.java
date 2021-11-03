package JavaCollection;
import java.util.*;
public class JA2_2_08 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("4", "7", "8", "9", "6", "3", "2", "5"));
        list.remove(3);
        System.out.print(list);
    }
}
