package JavaCollection;
import java.util.*;
public class JA2_3_08 {
    public static void main(String[] args) {
        int[] a1={ 1, 2, 5, 0, 6, 7 };
        int[] a2={ 0, 9, 7, 5, 3, 8 };
        Set<Integer> set1=new TreeSet<>();
        for (int j : a1) {
            set1.add(j);
        }
        Set<Integer> set2=new TreeSet<>();
        for (int j : a2) {
            set2.add(j);
        }
       set1.retainAll(set2);
        System.out.println(set1);
    }
}
