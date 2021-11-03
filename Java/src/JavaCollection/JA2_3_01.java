package JavaCollection;
import java.util.*;
public class JA2_3_01 {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        Collections.addAll(set,1,2,3,4,1,2);
        System.out.println(set);
        int a= set.size();
        System.out.println("kich co: "+a);
    }
}
