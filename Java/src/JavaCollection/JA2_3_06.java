package JavaCollection;
import java.util.*;
public class JA2_3_06 {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        Collections.addAll(set,1, 2, 1, 3, 3, 4, 3, 5, 5);
        if (set.isEmpty())
        {
            System.out.println("set rong");
        }
        else
        {
            System.out.println("set khac rong");
        }
    }
}
