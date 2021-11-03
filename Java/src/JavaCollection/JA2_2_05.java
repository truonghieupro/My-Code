package JavaCollection;
import java.util.*;
public class JA2_2_05 {
    public static void main(String[] args) {
        List<String> listT = new ArrayList<>(Arrays.asList("1", "4", "7", "8", "9", "6", "3", "2", "5"));
        Collections.shuffle(listT);
        System.out.println(listT);
    }
}
