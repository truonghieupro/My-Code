package JavaCollection;
import java.util.*;
public class JA2_2_06
{
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<>(Arrays.asList("1", "4", "7", "8", "9", "6", "3", "2", "5"));
        Iterator<String> b = list.iterator();
        while (b.hasNext())
        {
            Object c = b.next();
            System.out.print(c+" ");
        }
    }
}
