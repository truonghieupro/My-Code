package JavaMethods;
import java.util.*;
public class JA3_2_03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("truong");
        list.add("minh");
        list.add("hieu");
        System.out.println("cac phan tu trong list: ");
        HienList(list);
    }
    public static void HienList (List<String> input)
    {
        for (String i : input)
        {
            System.out.print(i+" ");
        }
    }
}
