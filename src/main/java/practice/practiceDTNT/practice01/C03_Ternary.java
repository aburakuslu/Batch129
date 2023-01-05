package practice.practiceDTNT.practice01;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

        /*
        Kullanicidan sifirdan buyuk pozitif bir tamsayi girmesini isteyin
        Girilen pozitif tamsayi 3 basamakli ise ekrana "3 Basamakli" yazdirin.
        3 basamakli degilse cift olup olmadigini kontrol edin.
        Cift ise "3 basamakli olmayan cift sayi" yazdirin
        Cift degilse "3 basamakli olmayan tek sayi" yazdirin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz: ");

        int num = input.nextInt();

        System.out.println("******** if ile cozumu ********");
        if (num > 0) {


            boolean sifirdanBuyukUcBas = num > 99 && num < 1000;
            boolean sifirdanBuyukUcBasOlmayanCift = (num > 99 && num < 1000) && num % 2 == 0;

            if (sifirdanBuyukUcBas) {
                System.out.println("3 basamakli sayi ");
            } else if (sifirdanBuyukUcBasOlmayanCift) {

            } else {
                System.out.println("3 basamakli olmayan pozitif cift sayi");
            }

        } else {           //negatif sayilar icin burasi calisir
            System.out.println("Lutfen pozitif bir tamsayi giriniz:");
        }


        System.out.println("******Ternary*****");

        boolean sifirdanBuyukUcBasTer = num > 99 && num < 1000;
        boolean sifirdanBuyukUcBasOlmayanCiftTer = (num > 99 && num < 1000) && num % 2 == 0;


        String sonuc=num>0     ?  sifirdanBuyukUcBasTer   ?    ("3 basamaklı sayı"): sifirdanBuyukUcBasOlmayanCiftTer
                ?    ("3 basamaklı olmayan çift sayı")    : ("3 basamaklı olmayan tek sayı") :
                ("Lutfen pozitif bir tamsayı giriniz");


        System.out.println(sonuc);


    }
}
