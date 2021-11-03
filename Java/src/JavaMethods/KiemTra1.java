package JavaMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KiemTra1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a","abcd","abc xyz","abcdxyz"));
        int n = list.size();
        InDanhSach(VietHoaDenN(list,n));
        System.out.println("\n");
        InDanhSach(SapXepDanhSach(list));
    }
    public static List<String> VietHoaDenN (List<String> list, int n)
    {
        List<String> list2 = new ArrayList<>();
        for (String x : list) {
            if (x.length()>=n)
            {
                list2.add(x.substring(0,n).toUpperCase()+x.substring(n));
            }
            else
            {
                list2.add(x.toUpperCase());
            }
        }
        return list2;
    }
    public static List<String> SapXepDanhSach (List<String> list)
    {
        List<String> list3 = new ArrayList<>();
        for (int i=0;i<list.size();i++)
        {
            for (int j=i+1;j<list.size();j++)
            {
                if (list.get(i).length()<list.get(j).length())
                {
                    String a = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,a);
                }
            }
            list3.add(list.get(i));
        }
        return list3;
    }
    public static void InDanhSach (List<String> list)
    {
        String[] a=list.toArray(new String[0]);
        for (String s : a) {
            System.out.print(s + ",");
        }
    }
}
