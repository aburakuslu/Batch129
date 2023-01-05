package day13whiledowhileloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        /*
            IT'de yeni bir sey ogrenirken;
            i) "Ne? Nedir?" oldugunu ogren
            ii) "Neden var? Nicin var?" oldugunu ogren
            iii) "Simple Implementation - Basit Uygulama"
            "Mid-Level Implementation - Orta Duzey Uygulama"
            "Advance-Level Implementation - Ileri Duzey Uygulama"
            "Project-Level Implementation - Proje Duzeyinde Uygulama"
            yapmak lazim.

            Piyasadakiler simple'da takilir. Siz simple-mid arasi levelde takilirsaniz ise girersiniz.
        */

        int a = 12; //Bu yapinin icinde sadece 1 tane data depolanabilir.
        // Ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
        // Bir yapinin icinde coklu data depolayabilmek icin Java "Array" yapisini olusturmustur.

        //Array nasil olusturulur?
        //Array olusturmak icin Array elemanlarinin "data type"i ve "eleman sayisi" mutlaka yazilmalidir.
        String stdNames[] = new String[5];

        //Array console'a nasil yazdirilir?
        //toString() method'unu kullanmadan sadece array ismi ile yazdirirsaniz Java o Array'in adresini yazdirir.
        System.out.println(Arrays.toString(stdNames)); //[null, null, null, null, null]

        //Array'e eleman ekleme nasil yapilir?
        stdNames[2] = "Ajda";
        System.out.println(Arrays.toString(stdNames)); //[null, null, Ajda, null, null]

        stdNames[0] = "Cuneyt";
        stdNames[1] = "Kemal";
        stdNames[3] = "Ezel";
        stdNames[4] = "Besir";

        System.out.println(Arrays.toString(stdNames)); //[Cuneyt, Kemal, Ajda, Ezel, Besir]

        //Array'den specific bir elemani almak

        System.out.println(stdNames[2]); //Ajda

        System.out.println();

        //Example 1: Array'deki her bir elemani sonuna "!" koyarak yazdiriniz.

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i] + "!");
        };










    }
}
