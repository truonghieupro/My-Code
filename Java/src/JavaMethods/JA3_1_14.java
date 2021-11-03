package JavaMethods;

import java.util.concurrent.TimeUnit;

public class JA3_1_14 {
    public static void main(String[] args) {
        int gio=5;
        long phut= TimeUnit.HOURS.toMinutes(gio);
        long giay= TimeUnit.HOURS.toSeconds(gio);
        System.out.format("%d gio bang %d phut %d giay ",gio,phut,giay);
    }
}
