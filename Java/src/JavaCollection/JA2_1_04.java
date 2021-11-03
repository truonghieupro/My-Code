package JavaCollection;
import java.util.*;
public class JA2_1_04 {
    public static void main(String[] args)
    {
        int [][] a={ { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        int [][] b={ { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };
        int [][] c=new int [a.length][a[0].length];
        for (int i=0;i< a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for (int[] s : c) {
            System.out.println(Arrays.toString(s));
        }
    }
}
