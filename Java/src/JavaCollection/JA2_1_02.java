package JavaCollection;
import java.util.*;
public class JA2_1_02 {
    public static void main(String[] args) {
        int n;
        Scanner a=new Scanner(System.in);
        do {
            {
                System.out.println("nhap vao mot so 2 chu so: ");
                n=a.nextInt();
            }
        } while (n<10);
       String chuoi=Integer.toString(n);
       char[] mangkitu = chuoi.toCharArray();
       System.out.println(mangkitu);
       boolean check=true;
       for (int i=0;i<mangkitu.length-1;i++)
       {
           if (mangkitu[i]>mangkitu[i+1])
           {
               check=false;
               System.out.println("ko la so tang");
               break;
           }
       }
       if (check)
       {
           System.out.println("la so tang");
       }
       a.close();
    }
}
