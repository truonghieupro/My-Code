package JavaCollection;
import java.util.*;
public class JA2_2_13 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> b= list.iterator();
        while (b.hasNext())
        {
            System.out.print(b.next());
        }
    }
}
