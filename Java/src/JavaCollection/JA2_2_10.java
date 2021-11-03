package JavaCollection;
import java.util.*;
public class JA2_2_10 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5));
        Integer[] a=new Integer[list.size()];
        a=list.toArray(a);
        int min=a[0],max=a[0];
        for (int i=0;i<a.length;i++)
        {
            if (a[i]<min)
            {
                min=a[i];
            }
            if (a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(+min+" "+max);
    }
}
