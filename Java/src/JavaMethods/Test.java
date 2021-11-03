package JavaMethods;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a","abcd","abc xyz","abcdxyz"));
        Collections.sort(list);
        System.out.println(list);

    }
}
