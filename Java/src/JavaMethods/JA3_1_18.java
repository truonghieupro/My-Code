package JavaMethods;

public class JA3_1_18 {
    public static void main(String[] args) {
        int[] a={ 1, 4, 7, 8, 9, 6, 3, 2, 5 };
        System.out.println("phan tu chan dau tien la: "+TimSoChanDauTien(a));
    }
    public static int TimSoChanDauTien (int[] a)
    {
        for (int i : a) {
            if (i % 2 == 0) {
                return i;
            }
        }
        return 0;
    }
}
