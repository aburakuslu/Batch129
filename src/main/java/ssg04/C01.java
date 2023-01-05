package ssg04;

import java.util.Arrays;

public class C01 {

    public static void main(String[] args) {

        String days[] = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        System.out.println(Arrays.toString(days));

        System.out.println("Toplam karakter sayisi: " + (days[0].length() + days[days.length - 1].length()));

    }
}
