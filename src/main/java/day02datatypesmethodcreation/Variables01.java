package day02datatypesmethodcreation;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Variables01 {

    // primitive data types --> char = boolean - byte - short - int - long - float - double
    // float: Virgullu sayilar (Ondalik sayilar = Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
    // double: Virgullu sayilar (Ondalik sayilar = Decimal Numbers) icin kullanilir. (Hucre agirligi 0.0000000000112

    // Note: primitive data type'larini Java olusturmustur, biz olusturamayiz.
    // Note: primitive data type'larinin isimlerinde sadece kucuk harf kullanilir.
    // Note: primitive data'lar data type'lara gore farkli farkli yer kaplar.
    // Note: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar.



    public static void main(String[] args) {

        //Ornek 1: Gomlek ve ayakkabi fiyatlari icin 2 tane variable olusturup, toplam fiyati ekrana yazdiriniz.
        //Java "Decimal Numbers" i otomatik olarak double kabul eder. Siz data type'ini "float" yazarsaniz
        // hata verir. Float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz.
        // float memory'de 4 byte yer kaplar, double 8 byte yer kaplar.
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        // System.out.println() ekrana yazdirir ve "pointer" i bir sonraki satira koyar.
        // System.out.print() ekrana yazdirir ve "pointer" i ayni satirda tutar.
        System.out.println(shirtPrice + shoesPrice);

        // System.out.println() kisaltmasi sout

        //Ornek 2: Hucre agirligi ve Amip'in agirligi icin iki tane variable olusturun
        // ve agirliklari farkini ekrana yazdirin

        double weightCell = 0.0000000000112;
        double weightAmip = 0.0000000000023;

        System.out.println(weightCell - weightAmip);
    }

}
