package JavaCollection;
import java.util.*;
public class JA2_2_09 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>(Arrays.asList("one", "Two", "three", "Four", "five", "six", "one", "three", "Four"));
        Collections.replaceAll(list,"one","ten");
        System.out.println(list);
    }
}
