package JavaMethods;

public class JA3_1_11 {
    public static void main(String[] args) {
        int[] a={ 1, 4, 7, 8, 9, 6, 3, 2, 5 };
        int n=a.length;
        ThayThe(a,n);
    }
    public static void ThayThe (int[] a,int n)
    {
        int first = Integer.MAX_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i=0;i<n;i++)
        {
            if (a[i]<first)
            {
                second=first;
                first=a[i];
            }
            else if (a[i]<second && a[i]!=first)
            {
                second=a[i];
            }
        }
        for (int i=0;i<n;i++)
        {
            if (a[i]!=first)
            {
                a[i]=first;
            }
            else
            {
                a[i]=second;
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+", ");
        }
    }
}
