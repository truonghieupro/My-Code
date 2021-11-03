package JavaCollection;
import java.util.*;
public class JA2_1_03 {
    public static void main(String[] args) {
        int [][] a={{ 1, 2, 3, 10 }, { 4, 5, 6, 11 }, { 7, 8, 9, 12 }};
        for (int[] ints : a) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
