package JavaCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class JA2_2_03 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList( "1", "4", "7", "8", "9", "6", "3", "2", "5"));
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
