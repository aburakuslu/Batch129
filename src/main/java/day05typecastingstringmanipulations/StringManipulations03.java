package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        /*
            Example 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                       I) En az 8 character olmali
                      II) Space characteri olmamali
                     III) En az 1 tane buyuk harf olmali
                      IV) En az 1 tane kucuk harf olmali
                       V) En az 1 tane sembol olmali
                      VI) En az 1 tane rakam olmali
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz: ");
        String pwd = input.nextLine();

        //I) En az 8 character olmali
        boolean first = pwd.length()>7;
        System.out.println(first);

        //II) Space characteri olmamali
        boolean second = !pwd.contains(" ");
        System.out.println(second);

        //III) En az 1 tane buyuk harf olmali
        //Note: Buyuk harf olmayanlari sil,
        //      Kalan karakter sayisina bak.
        //      Karakter sayisi 0 ise buyuk harf yok demektir.
        //      0'dan buyuk ise buyuk harf var demektir.
        boolean third = pwd.replaceAll("[^A-Z]", "").length()>0; //Method'lari ayni satirda
                                                                                  //kullanmaya "method chain" denir.
        System.out.println(third);


        //IV) En az 1 tane kucuk harf olmali
        boolean fourth = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println(fourth);

        //V) En az 1 tane sembol (harf ve rakam harici her sey) olmali

        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]", "").length()>0; // Semboller harici hepsi silindi.
        System.out.println(fifth);

        //VI) En az 1 tane rakam olmali

        boolean sixth = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println(sixth);

        System.out.println("Password gecerli mi?: " + (first && second && third && fourth && fifth && sixth));



    }
}
