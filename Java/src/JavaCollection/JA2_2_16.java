package JavaCollection;
import java.util.*;
public class JA2_2_16 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5));
        ListIterator<Integer> b= list.listIterator();
        while (b.hasNext())
        {
            System.out.print(b.next()+", ");
        }
        System.out.println("\nAfter:");
        while (b.hasPrevious())
        {
            System.out.print(b.previous()+", ");
        }
    }
}
