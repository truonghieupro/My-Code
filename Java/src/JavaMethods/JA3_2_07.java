package JavaMethods;

import java.util.*;

public class JA3_2_07 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot so");
        n=sc.nextInt();
        TaoSoNhoNhat(n);
        sc.close();
    }
    public static void TaoSoNhoNhat (int n)
    {
       String x = Integer.toString(n);
       List<String> list = new ArrayList<>(Arrays.asList(x.split("")));
       Collections.sort(list);
       for (int i=0;i<list.size();i++)
       {
           if (!list.get(i).equals("0"))
           {
               String a=list.get(0);
               list.set(0,list.get(i));
               list.set(i,a);
               break;
           }
       }
        for (String i : list)
        {
            System.out.print(i);
        }
    }
}
