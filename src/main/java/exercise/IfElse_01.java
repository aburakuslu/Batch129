package exercise;

import java.util.Scanner;

public class IfElse_01 {

    public static void main(String[] args) {


        // EXAMPLE 1: Verilen karakter buyuk harf ise ekrana "Buyuk harf" yazan kodu olusturunuz.
//**********************************************************************************************************************
        //Cozum 1
        Scanner input = new Scanner(System.in);
         /*
        System.out.println("Lutfen bir harf giriniz: ");

        char letter = input.next().charAt(0);

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println("Buyuk harf");
        } else if (letter >= 'a' && letter <= 'z') {
            System.out.println("Kucuk harf");
        } else
            System.out.println("Gecersiz harf! Tekrar deneyiniz.");

         */


        // EXAMPLE 2: Verilen sayi cift sayi ise ekrana "Cift sayi" yazdiran kodu olusturun
//**********************************************************************************************************************
        /* Cozum 2
        System.out.println("Lutfen bir sayi giriniz: ");
        int number1 = input.nextInt();

        if (number1 % 2 == 0) {
            System.out.println("Cift Sayi");
        } else
            System.out.println(" Tek Sayi ");
         */


        // EXAMPLE 3: Verilen bir sayi 300 den kucuk veya 1200 den buyuk ise ekrana "harika sayi" yazdiran kodu olusturun
//**********************************************************************************************************************
        /* Cozum 3
        System.out.println("Lutfen bir sayi giriniz: ");
        int number2 = input.nextInt();
        if(number2<300 || number2>1200){
            System.out.println("Harika sayi");
        }
        */


        // EXAMPLE 4: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz
//**********************************************************************************************************************

        /* Cozum 4
        System.out.println("Lutfen bir sayi giriniz: ");
        int number3 = input.nextInt();

        if (number3 % 2 == 0) {
            System.out.println("Cift Sayi");
        }else
            System.out.println("Tek sayi");
         */


        // EXAMPLE 5: Verilen bir sayinin negetif, pozitif yada notr oldugunu soyleyen kodu yaziniz.
//**********************************************************************************************************************

//        System.out.println("Lutfen bir sayi giriniz: ");
//        int inputNum = input.nextInt();


//        if(inputNum<0){
//            System.out.println("Bu bir negatif sayidir.");
//        }else if (inputNum>0){
//            System.out.println("Bu bir pozitif sayidir.");
//        }else if (inputNum==0){
//            System.out.println("Bu bir notr sayidir.");
//        }else
//            System.out.println("Hata! Lutfen gecerli bir sayi giriniz.");




        /*

        EXAMPLE 6:

         Kullanici gun numarasini girsin kod gun ismini yazsin

         ==> Pazar 2 ==> Pazartesi 3 ==> Sali 4 ==> Carsamba 5 ==> Persembe 6 ==> Cuma 7 ==> Cumartesi
         */

//        System.out.println("Lutfen 1-7 arasi bir sayi giriniz:");
//        byte gunSayisi = input.nextByte();
//
//        if (gunSayisi == 1) {
//            System.out.println("Pazar");
//        } else if (gunSayisi == 2) {
//            System.out.println("Pazartesi");
//        } else if (gunSayisi == 3) {
//            System.out.println("Sali");
//        } else if (gunSayisi == 4) {
//            System.out.println("Carsamba");
//        } else if (gunSayisi == 5) {
//            System.out.println("Persembe");
//        } else if (gunSayisi == 6) {
//            System.out.println("Cuma");
//        } else if (gunSayisi == 7){
//            System.out.println("Cumartesi");
//        }else
//            System.out.println("Hata! Lutfen 1-7 arasi bir rakam giriniz.");


//**********************************************************************************************************************

        // EXAMPLE 7: Kullanicidan gun isimlerini aliniz haftaici mi haftasonu mu oldugunu yazdiran kodu olusturunuz.

//        System.out.println("Lutfen gun ismi giriniz: ");
//        String dayName = input.next();
//
//        if(dayName.equalsIgnoreCase("pazartesi")){
//            System.out.println("Haftaici");
//        }else if(dayName.equalsIgnoreCase("sali")){
//            System.out.println("Haftaici");
//        }else if(dayName.equalsIgnoreCase("carsamba")){
//            System.out.println("Haftaici");
//        }else if (dayName.equalsIgnoreCase("persembe")){
//            System.out.println("Haftaici");
//        }else if (dayName.equalsIgnoreCase("cuma")){
//            System.out.println("Haftaici");
//










//**********************************************************************************************************************

        /*
        EXAMPLE 8:

        Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.
        - 0-4 arasi "Bebek"
        - 5-12 arasi "Cocuk"
        - 13-20 arasi "Genc"
        - 21-30 arasi "Yetiskin
        Tanimlanmamis Evre
        Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
        */
//**********************************************************************************************************************
        /*
        EXAMPLE 9:

        Kullanicidan bir gun alin
        - Eger gun cuma ise "Muslumanlar icin kutsal gun"
        - Eger gun cumartesi ise "Yahudiler icin kutsal gun"
        - Eger gun pazar ise "Hiristiyanlar icin kutsal gun"
        Yazdiran kodu yaziniz
        */
//**********************************************************************************************************************
        /*
        EXAMPLE 10:

        Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        dort islemden biri ile isleme koyup yazdiriniz.
        */




        /*
        Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin
        kare olup olmadigini yazdiriniz
        */

//**********************************************************************************************************************

    /*
    EXAMPLE 12:

    Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdiriniz
     */

//**********************************************************************************************************************

    /*
    EXAMPLE 13:

    Kullaniciya yasini sorun, eger yas 65'den kucuk ise "emekli olamazsin, calismalisin",
    65'e esit veya buyukse "Emekli olabilisin" yazdiriniz
     */

//**********************************************************************************************************************

    /*
    EXAMPLE 14:

    Kullanicidan bir ucgen uc kenar uzunlugunu alin eger uc kenar uzunlugunu birbirine esit ise
    ekrana "Eskenar ucgen " yazdiriniz. diger durumlarda ekrana "Eskenar degil" yazdiriniz
     */

//**********************************************************************************************************************

    /*
    EXAMPLE 15 :

    Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun isminin 1.,2. ve 3.harflerini
   ilk harf buyuk diger ikisi kucuk olarak yazdirini, gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdiriniz
     */

//**********************************************************************************************************************

    /*
    EXAMPLE 16 :

    Kullanicidan iki sayi isteyin, sayilarin ikisi de positif ise sayilarin toplamını yazdirin,
    sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere
    sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin, sayilardan sifira esit olan varsa
    "sifir carpmaya gore yutan elemandir" yazdirin.
    */

//*******************************************************************************************************

    /*

   EXAMPLE 17 :

   Kullanicidan 100 uzerinden notunu isteyin. Not'u harf sistemine cevirip yazdirin.
   50'den kucukse "D", 51-60 arasi "C", 60-80 arasi "B", 80'nin uzerinden ise "A"
   */

//*******************************************************************************************************

    /* Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
            teklif 80.000 arasinda ise "Kabul ediyorum ",
            60 - 80.000 arasinda ise "Konusabiliriz"
            60.000 'nin altinda ise "Maalesef Kabul edemem" yazdirin
            */
//************************************************************************************************

    /*
    EXAMPLE 18 :

    Nested if kullanarak asagidaki soruyu cozen kodu yaziniz.

    Kullanicidan bir sifre girmasini isteyin

    Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin.Ilk harf A ise "Gecerli Sifre" degilse
    "Gecersiz Sifre" yazdirin

    Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin.Ilk harf z ise "Gecerli Sifre" degilse
    "Gecersiz Sifre" yazdirin
         */
//************************************************************************************************

    /*
    EXAMPLE 19 :

    Kullanicidan 4 basamakli bir sayi girmesini isteyin. Girdigi sayi 5'e bolunuyorsa son rakamini kontrol
    edin. Girdigi sayi 5'e bolunuyorsa son eakamini kontrol edin. Son Rakami 0 ise ekrana "5'e bolunen
    cift sayi" yazdirin . son rakami 0 degil ise "5'e bolunen tek sayi" yazdirin.
    Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin" yazdirin.
     */
//********************************************************************************************

    /*
    EXAMPLE 20 :  INTERVIEW QUESTION

    Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.

    Kural 1 : 4 ile bolunemeyen yillar artik yil degildir
    Kural 2 : 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
    Kural 3 : 4'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400 'un kati olan yillar artik yildir
     */
//********************************************************************************************************************************

//  ****************************Nested If Else Statements *******************


    /*
    EXAMPLE 21 :   INTERVIEW QUESTION

    Kullanicidan artk yil olup olmadigini kontrol etmek icin yil girmesini isteyin.

    Kural 1 : 4 ile bolunemeyen yillar artik yil degildir
    Kural 2 : 4 'un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400'un kati olan yillar artik yildir
     */
//********************************************************************************************************************************


//    *****************Ternary **************

    /*
    EXAMPLE 22 :

    Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, girilen degerlere gore dikdortgenin
    kare olup olmadigini yazdiriniz
      */

//************************************************************************************************

    /*
    EXAMPLE 23 :

    Kullanicidan bir sayi alin ve sayi 3 basamakli ise "uc basamakli sayi " , yoksa "Uc basamakli degil " yazdiriniz

     */


    }
}
