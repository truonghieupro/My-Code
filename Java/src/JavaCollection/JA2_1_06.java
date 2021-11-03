package JavaCollection;

public class JA2_1_06 {
    public static void main(String[] args) {
        String a="   NgUyen VaN   An   "; a=a.trim().toLowerCase();
       while (a.contains("  "))
       {
           a=a.replace("  "," " );
       }
        String[] chuoi=a.split(" ");
        StringBuilder ten= new StringBuilder(chuoi[chuoi.length - 1]);
        ten = new StringBuilder(ten.substring(0, 1).toUpperCase() + ten.substring(1).toLowerCase());
        for (int i=0;i< chuoi.length-1;i++)
        {
            ten.append(chuoi[i].substring(0, 1).toUpperCase());
        }
        System.out.println(ten+"@hvitclan");
    }
}
