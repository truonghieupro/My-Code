package JavaCollection;
import java.util.*;
public class JA2_2_12 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 3, 4, 3, 5, 5));
        Collections.sort(list); // 1,1,2,3,3,3,4,5,5
        int dem = 1;
        for (int i=0;i<list.size()-1;i++)
        {
            if (list.get(i)==list.get(i+1))
            {
                dem++;
            }
            else
            {
                System.out.print(list.get(i)+"-"+dem+" ");
                dem=1;
            }
        }
        System.out.println(list.get(list.size()-1)+"-"+dem);
    }
}
