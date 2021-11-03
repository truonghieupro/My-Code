package JavaCollection;
import java.util.Arrays;
import java.util.OptionalDouble;
public class JA2_1_08 {
    public static void main(String[] args) {
        int[] a = { 1, 4, 7, 8, 9, 6, 3, 2, 5 };
        OptionalDouble tb = Arrays.stream(a).average();
        System.out.println("gia tri trung binh cua mang a "+tb);
    }
}
