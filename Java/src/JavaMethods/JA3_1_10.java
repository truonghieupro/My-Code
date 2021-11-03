package JavaMethods;

public class JA3_1_10 {
    public static void main(String[] args) {
        String a = " nguyen        van   Toan";
        a=a.trim();
        System.out.println("chuoi sau khi chuan hoa: "+VietHoa(a));
    }
    public static String VietHoa (String input)
    {
        String[] chuoi = input.split("\\s+");
        for (int i=0;i<chuoi.length;i++)
        {
            chuoi[i]=chuoi[i].substring(0,1).toUpperCase()+chuoi[i].substring(1);
        }
        return String.join(" ",chuoi);
    }
}
