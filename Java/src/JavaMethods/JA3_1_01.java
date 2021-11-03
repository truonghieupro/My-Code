package JavaMethods;
import java.util.*;
import java.util.stream.Collectors;

public class JA3_1_01 {
    public static Set<Integer> ListToSet1(List<Integer> input)
    {
        Set<Integer> set = new HashSet<>();
        for (Integer g : input)
        {
            set.add(g);
        }
        return set;
    }
    public static Set<Integer> ListToSet2(List<Integer> input)
    {
        return new HashSet<>(input);
    }
    public static Set<Integer> ListToSet3(List<Integer> input)
    {
        Set<Integer> set = new HashSet<>();
        set.addAll(input);
        return set;
    }
    public static Set<Integer> ListToSet4(List<Integer> input)
    {
        Set<Integer> set = input.stream().collect(Collectors.toSet());
        return set;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 7, 8, 9, 6, 3, 2, 5));
        System.out.println(ListToSet1(list));
        System.out.println(ListToSet2(list));
        System.out.println(ListToSet3(list));
        System.out.println(ListToSet4(list));
    }
}
