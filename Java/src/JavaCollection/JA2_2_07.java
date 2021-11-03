package JavaCollection;
import java.util.*;
public class JA2_2_07 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("Cam", "Quyt", "Mit", "Dua", "Dua", "Le", "Tao", "Oi"));
        int a=list.indexOf("Dua");
        int b=list.lastIndexOf("Dua");
        System.out.println("vi tri dau tien va cuoi cung cua phan tu Dua lan luot la "+a+" va "+b);
    }
}
