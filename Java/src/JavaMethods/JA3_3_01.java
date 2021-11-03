package JavaMethods;
import java.util.*;
public class JA3_3_01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,0));
        TimSoNhoNhatConThieu(list);
    }
    public static void TimSoNhoNhatConThieu (List<Integer> list)
    {
        Collections.sort(list);
        for (int i=0;i<list.size()-1;i++)
        {
            if ((list.get(i)+1)!=list.get(i+1) && KhoangCachTungSo(list)==1)
            {
                System.out.print(list.get(i)+1);
                break;
            }
            else if (KhoangCachTungSo(list)==0)
            {
                System.out.print(list.get(list.size()-1)+1);
                break;
            }
        }
    }
    public static int KhoangCachTungSo (List<Integer> list)
    {
        Collections.sort(list);
        for (int i=0;i<list.size()-1;i++)
        {
            if (list.get(i+1)-list.get(i)!=1)
            {
                return 1;
            }
        }
        return 0;
    }
}
