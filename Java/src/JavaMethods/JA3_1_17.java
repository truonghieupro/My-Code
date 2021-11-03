package JavaMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JA3_1_17 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5,2,3,4,7,8));
        XoaSoLe(list);
        System.out.println("cac so con lai la: "+list);
    }
    public static void XoaSoLe (List<Integer> input)
    {
        input.removeIf(x -> x%2!=0);
    }
}
