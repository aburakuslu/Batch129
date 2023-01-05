package day09incrementdecrementternaryswitch;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1:
        int a = 10;
        int b = 20;

        int r1 = a<b ? a++ : ++b;


        System.out.println(r1); //
        System.out.println(a); //
        System.out.println(b); //

        //Example 2: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //             -4 ==> -1 *-4    4 ==> 4     0 ==> 0

        int c = -4;

        int r2 = c<0 ? -1*c : c;
        System.out.println(r2);

        //Example 3: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise "Farkli isaretli
        // sayilari carpamiyorum" mesaji veren kodu yaziniz.

        int m = 5;
        int n = -6;

        //"Object" Java'da butun "Data Type"(Class) larinin ortak "Parent"idir.
        //"Object" in "Parent"i yoktur.
        //Farkli data type'lari icin ortak bir variable olusturmak istediginizde, data type olarak object
        // kullanabilirsiniz.
        // Java'da "Object", insanlik aleminde "Hz. Adem"e benzer


        Object r3 = (m>0 && n>0) || (m<0 && n<0) ? m*n : "Farkli isaretli sayilari carpamiyorum";

        System.out.println(r3);

        //Example 4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int p = 436;
        int r = Math.abs(p);

        String r4 = p>99 && p<1000 ? p + "uc basamaklidir" : "uc basamakli degildir";

        System.out.println(r4);
    }
}
