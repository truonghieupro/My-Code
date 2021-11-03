package JavaCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JA2_2_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("1", "4", "7", "8", "9", "6", "3", "2", "5"));
       for (int i=0;i<list.size();i++)
       {
           System.out.print(i+"-"+list.get(i)+",");
       }
    }
}
