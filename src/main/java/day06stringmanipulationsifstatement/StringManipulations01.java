package day06stringmanipulationsifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Bir String'in basinda ve sonunda space karakteri varsa siliniz.
        //            "   Ali Can   "  ==>   "Ali Can"

        String s = "   Ali Can   ";
        System.out.println(s);

        //trim() method'u bir String'in basinda ve sonundaki space character'lerini siler,
        // aradaki space'lere dokunmaz
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";     String laptop = "$875.99";  ==> 456.99 + 875.99
        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$", "");
        System.out.println(tv2); //456.99

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2); //875.99

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice); //1332.98

        //Example 3: Verilen ismin, ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "Ali Can" ==> AC
        String name = "    ali cAN   ";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first); //A

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second); //C

        System.out.println("" + first + second);

        //Example 4: Bir String'in hic karakter icermedigini(Bos String) kontrol eden kodu yaziniz.
        String str = "";

        //1. Yol: length()

        boolean result1 = str.length() == 0;
        System.out.println("string bos mu?" + result1); //true

        //2. Yol: isEmpty() . Java bir konuda method uretmisse, o method'u kullanmak en iyisidir.

        boolean result2 = str.isEmpty();
        System.out.println("string bos mu?" + result2); //true

        //Example 5: Bir string'in space haric hicbir karakter icermedigini kontrol eden kodu yaziniz.

        String t = "     ";

        //1. Yol:
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println("Sadece space mi var? " + result3);

        //2. Yol:
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("Sadece space mi var? " + result4);

        //3, Yol:
        // isBlank() method'u sadece space iceren String'ler icin true verir, space disinda bir character icerirse
        // false verir.
        // isBlank() method'u bos String'ler icin de true verir.
        // isBlank() ==> space + hicbir sey icin true      isEmpty() ==> hicbir sey icin true

        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var? " + result5);

        //Example 6: Bir String'de a, e, i characterlerinin indexleri toplamini ekrana yazdiriniz.
        //           "Java is easy to learn" ==> 1 + 5 + 8 = 14

        String r = "Java is easy to learn";

        int idxA = r.indexOf('a');
        System.out.println(idxA); //1

        int idxI = r.indexOf('i');
        System.out.println(idxI); //5

        int idxE = r.indexOf('e');
        System.out.println(idxE); //8

        System.out.println("Index'ler toplami: " + (idxA + idxI + idxE));


        //Example 7: Bir String'de "Java" kelimesinin ilk olarak kacinci index'te kullanildigini gosteren
        //  kodu yaziniz.
        //           "Ah Java vah Java sensiz olmuyor Java." ==> 3

        String u = "Ah Java vah Java sensiz olmuyor Java.";

        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J'nin) index'ini
        //  almis olursunuz.
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava); //3

        //indexOf() method'u olmayan karakterler icin kullanilirsa her zaman -1 verir.
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz); //-1


        //Example 8: Bir String'de a, i, e character'lerinin son gorunumlerinin indexleri toplamini ekrana yaziniz.
        //         "Java is easy to learn" ==> 18 + 5 + 17 = 40

        String v = "Java is easy to learn";
        int idxOfA = v.lastIndexOf('a'); //18
        System.out.println(idxOfA);

        int idxOfI = v.lastIndexOf('i'); //5
        System.out.println(idxOfI);

        int idxOfE = v.lastIndexOf('e'); //17
        System.out.println(idxOfE);

        System.out.println("Index'ler toplami: " + (idxOfA + idxOfI + idxOfE));

        //Note: lastIndexOf() String olmayan bir character icin kullanilirsa her zaman "-1" verir.

        //Example 9: Bir String'deki tekrarsiz characterleri ekrana yazdiriniz.

        //           "abbcccdc" ==> ad

        String y = "aac";
        char ch1 = y.charAt(0);
        if (y.indexOf(ch1) == y.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }

        char ch2 = y.charAt(1);
        if (y.indexOf(ch2) == y.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if (y.indexOf(ch3)==y.lastIndexOf(ch3)) {
            System.out.println(ch3);
        }


        //Example 12: Sayi 3 basamakli ise "Wooow!" yazdirin.

        int n = -360;

        n = Math.abs(n);


        if(n > 99 && n < 1000){
            System.out.println("Wooow!");
        }













        //Note: Bazi kodlarin bazi sartlara bagli olarak calismasi gerekir.
        //      Bazi kodlari bazi sartlara gore aktive etmek icin "if statement" kullanilir.
        //      if you study hard, you will learn Java.


        //Example 10: Sayi pozitif ise ekrana cift yazdirin
        int num = -12;

        if (num > 0) {
            System.out.println("Pozitif");
        }

        //Example 11: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin.

        int number = 30;

        if (number > -1 && number < 10) {
            System.out.println("Rakam");
        }


    }
}
