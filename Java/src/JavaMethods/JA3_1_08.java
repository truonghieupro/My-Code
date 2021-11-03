package JavaMethods;

public class JA3_1_08 {
    public static void main(String[] args) {
        String a = " Nguyen van     a ";
        a.trim();
        a=a.replaceAll("\\s+"," ");
        System.out.println(VietHoa(a));
    }
    public static String VietHoa(String input)
    {
        String output = input.substring(0,1).toUpperCase()+input.substring(1);
        return output;
    }
}
