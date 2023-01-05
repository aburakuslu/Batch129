package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.

        String arr[] = new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println(Arrays.toString(arr)); //[Math, Science, Music, English, Art]

        System.out.println("Toplam: " + (arr[0].length() + arr[arr.length - 1].length()) + " karakter vardir."); //7


        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.


        String brr[] = new String[5];

        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athens";

        //1. Yol: for-loop
        int totalChar = 0;

        for (int i = 0; i < brr.length; i++) {
            totalChar = totalChar + brr[i].length();
        }
        System.out.println("Toplam Karakter Sayisi: " + totalChar); //Toplam Karakter Sayisi: 33

        //2. Yol: for-each-loop(enhanced loop) ==> baslangic degeri, loop'un calisma sarti, increment/decrement kismini kendisi halleder.
        //        for-each-loop "Array" lerde ve "Collection" larda kullanilir.
        //        Index kullanmaniz gerektiginde, bazen for-each-loop caresiz kalir. Mecburen diger loop'lari kullaniriz.

        int sum = 0;
                            //Miami, Istanbul, Frankfurt, Dhaka, Athens
        for(String w : brr){
            sum = sum + w.length();
        }
        System.out.println("Toplam karakter sayisi: " + sum); //Toplam karakter sayisi: 33





    }
}
