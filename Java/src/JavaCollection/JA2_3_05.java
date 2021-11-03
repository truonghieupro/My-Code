package JavaCollection;
import java.util.*;
public class JA2_3_05 {
    public static void main(String[] args) {
        Set<Integer> setA= new TreeSet<>();
        Collections.addAll(setA,1,2,3,4,5);
        System.out.println("setA "+setA);
        Set<Integer> setB= new TreeSet<>();
        Collections.addAll(setB,6,7,8,9,2);
        System.out.println("setB " +setB);
        setB.remove(2);
        System.out.println(setB);
        if (setA.contains(2))
        {
            setB.removeAll(setB);
        }
        System.out.println("setB "+setB);
        setA.clear();
        System.out.println("setA "+setA);
    }
}
