package ssg04;

import java.util.Arrays;

public class C08_Arrays01 {

    public static void main(String[] args) {

        String colors[] = new String[5];
        colors[0] = "Black";
        colors[1] = "White";
        colors[2] = "Blue";
        colors[3] = "Orange";
        colors[4] = "Brown";

        System.out.println(Arrays.toString(colors)); //        System.out.println(Arrays.toString(colors));

        System.out.println(colors[0].length() + colors[colors.length-1].length());

        //String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.


        String names[] = new String[5];
        names[0] = "ali";
        names[1] = "veli";
        names[2] = "mehmet";
        names[3] = "tolga";
        names[4] = "burak";

        int totalChar = 0;

        for (int i = 0; i < names.length; i++) {
            totalChar = totalChar + names[i].length();
            //  0           0     +       3
        }
        System.out.println(totalChar);
    }
}
