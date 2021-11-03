package JavaCollection;
import java.util.*;
public class JA2_2_14 {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<Integer>(Arrays.asList( 1, 2, 3, 4));
        List<Integer> list2=new ArrayList<Integer>(Arrays.asList( 12, 122, 3 , 4));
        list1.retainAll(list2);
        System.out.println(list1);
    }
}
