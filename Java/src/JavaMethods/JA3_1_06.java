package JavaMethods;

public class JA3_1_06 {
    public static void main(String[] args) {
        String a="Hvit Clan Is Number One ";
        System.out.println("so khoang trang = "+DemKhoangTrang(a));
    }
    public static int DemKhoangTrang(String a)
    {
       return (int)a.chars().filter(Character::isWhitespace).count();
    }
}
