package JavaCollection;
import java.util.*;
public class JA2_1_09 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(121, 423, 657, 89, 90, 61, 33, 22, 54));
        System.out.println("cac so tang la: ");
        for (int i=0;i<list.size();i++)
        {
           if (KiemTraSoTang(list.get(i))==true)
            {
                System.out.println(list.get(i));
            }
        }
    }
    public static boolean KiemTraSoTang (int n)
    {
        String chuoi=Integer.toString(n);
        char[] mangkitu = chuoi.toCharArray();
        for (int i=0;i<mangkitu.length-1;i++)
        {
            if (mangkitu[i]>mangkitu[i+1])
            {
                return false;
            }
        }
        return true;
    }
}
