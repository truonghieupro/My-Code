package JavaMethods;

public class JA3_2_02 {
    public static void main(String[] args) {
        double a=3,b=6,c=1;
        GiaiPhuongTrinh(a,b,c);
    }
    public static void GiaiPhuongTrinh (double a,double b,double c)
    {
        if (a==0)
        {
            if (b==0)
            {
                if (c==0)
                {
                    System.out.println("pt vo so nghiem");
                }
                else
                {
                    System.out.println("pt vo nghiem");
                }
            }
            else
            {
                System.out.format("pt co nghiem %f ",-c/b);
            }
        }
        else
        {
            double delta = b * b - 4 * a * c;
            if (delta > 0)

            {
                System.out.format("pt co hai nghiem phan biet %f va %f ",(-b+Math.sqrt(delta))/(2*a),(-b-Math.sqrt(delta))/(2*a));
            }
            else if (delta == 0)
            {
                System.out.format("pt co nghiem kep %.1f", -b / (2 * a));
            }
            else
                System.out.println("pt vo nghiem");
        }
    }
}
