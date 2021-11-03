package JavaMethods;

import java.util.*;

public class JA3_1_09 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Nguyen Duc Toan","Nguyen Hoang Truong","Nguyen Dong Khanh"));
        HienList(DaoNguoc(list));
    }
    public static void HienList (List<String> input)
    {
        for (String i : input)
        {
            System.out.print(i+", ");
        }
    }
    public static List<String> DaoNguoc (List<String> input)
    {
        Collections.reverse(input);
        return input;
    }
}
