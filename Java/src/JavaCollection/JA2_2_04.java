package JavaCollection;
import java.util.*;
public class JA2_2_04 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
        List<String> list2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        Collections.copy(list1,list2);
        System.out.println(list1);
        System.out.println(list2);
    }
}
