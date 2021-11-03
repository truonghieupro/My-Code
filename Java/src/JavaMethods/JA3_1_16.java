package JavaMethods;

public class JA3_1_16 {
    public static void main(String[] args) {
        int[] a={ 1,2,3,4,5 };
        System.out.println("tong cac phan tu cua mang: "+tong(a));
    }
    public static int tong (int[] a)
    {
        int tong=0;
        for (int i : a)
        {
            tong+=i;
        }
        return tong;
    }
}
