package day28exceptions;

public class Exceptions01 {

    /*
        1) Exception demek beklenmedik problem demektir. Seyahatte benzinin bitmesi, arabanin bozulmasi
        gibi.
        2) Gercek hayatta karsilastigimiz beklenmedik problemler icin cozum yollarimiz vardir. Mesela benzin bitince
        yol yardimi arariz. Application'larda da beklenmedik problemler icin cozum yollari uretmeliyiz, bu isleme
        "Exception Handling" denir.
        3) Exception'lar temel olarak ikiye ayrilirlar:
                i) Compile Time Exception: Siz code yazarken fark edilir ve yazdiginiz kodun alti kirmizi cizgi ile cizilir.
                ii) Run time exception: Siz code yazarken farkedilmez ama, code'u calistirdiginizda console'da hata alirsiniz.
        4) Exception'lar disinda "Error" diye adlandirdigimiz "Handle" edilemeyen problemler vardir.
           Gercek hayatta soforun olmesi gibi handle edilemeyecek durumlar "Error" dur.
           Application'larda "Memory" nin dolmasi "Error" dur.
           Iki tur memory vardir: i) Stack Memory dolarsa "StackOverFlow Error" alirsiniz.
                                 ii) Heap Memory dolarsa "OutOfMemory Error" alirsiniz.
        5) Yazdiginiz kod calismadiginda problemi bulmak icin "log"lara bakariz
        6) if else kullanirsak olusacak her problemi spesifik olarak if parantezinin icine yazmamiz gerekir.
           Bu da ciddi bir matematik bilgisi gerektirir ve yazacagimiz kodu cok uzatir.
           Ama try catch'te Java ilgili Exception ile alakali olusabilecek butun problemleri yakalar.


            Exception Turleri Hatirlatma:
            Aritmetik Exception yazdığınız code'da matematiksel işlem kullanıyorsanız alanabilecek bir Exception'dir.
            8) İçinde rakamlar dışında character olan bir String 'i sayıya çevirmek isterseniz Java "NumberFormatException" atar
            9) Bütün exceptionlar classtır
            10)String'lerde var olmayan index'ler kullanıldığında Java "StringIndexOutOfBoundsException" atar.
            11) Array'lerde olmayan index kullanıldığında ArrayIndexOutOfBounds atar.
     */
    public static void main(String[] args) {

        int a = 12;
        int b = 0;

        divide(a, b);
        divide2(a, b);
    }

    //ArithmeticException yazdiginiz code'da matematiksel islem kullaniyorsaniz alinabilecek bir Exception'dir.
    //Nasil handle edilecegini asagida yazdik
    public static void divide(int a, int b) {
        try {
            System.out.println(a / b);

            System.out.println("I am here");

        } catch (ArithmeticException e) {

            System.out.println("Do not divide by zero");
        }
        System.out.println("You are here");
    }

    //"Exception Handling" de if-else kullanilmaz, bkz. 6. kural.
    public static void divide2(int a, int b) {
        if (b == 0) {
            System.out.println("Do not divide by zero");
        } else {
            System.out.println(a / b);
        }
    }
}