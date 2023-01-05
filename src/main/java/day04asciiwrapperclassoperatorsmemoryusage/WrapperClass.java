package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {

    public static void main(String[] args) {

        //primitive:       char -     boolean - byte - short -  int -    long - float - double
        //Wrapper Class:  Character - Boolean - Byte - Short - Integer - Long - Float - Double
        //Wrapper Class'lar non-primitive'dir, o yuzden memory'de cok yer kaplar. Bu sebeple, sart degilse
        //Wrapper Class kullanmayi tercih etmeyiz.

        int n = 12; //n yazip nokta koyulursa hic method gorulmez, cunku primitive'ler method icermez.
        Integer m = 12;  //m yazip nokta koyulursa bircok method gorulur, cunku wrapper class'lar method icerir.

        byte p = 23;
        Byte r = 43;

        //Example 1: Short data type'inin minimum ve maximum degerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        //Example 2: int data type'inin minimum degeri ve byte data type'inin maximum degerlerinin toplamini
        // kod yazarak bulunuz.

        int minInt = Integer.MIN_VALUE;

        byte maxByte = Byte.MAX_VALUE;

        System.out.println(minInt + maxByte);

        //Example 3: I) primitive int'i Wrapper Integer'a ceviriniz. (Autoboxing)

        int num = 22;

        Integer wrapperNum = num;

        System.out.println(wrapperNum); //22

        //II) Wrapper Byte'i primitive byte'a ceviriniz. (Unboxing)

        Byte k = 43;

        byte primitiveK = k;

        System.out.println(primitiveK); //43

        //Example 4: I) primitive char'i Wrapper Character'e ceviriniz. (Autoboxing)
        //           II) Wrapper Boolean'i primitive boolean'a ceviriniz. (Unboxing)


        // 1)
        char initial = 'J';

        Character initialWrapper = initial;

        System.out.println(initial);


        // 2)
        Boolean isOld = true;

        boolean isOldWrapper = isOld;

        System.out.println(isOld);


        //Example 5: Size String olarak verilen iki fiyatin toplamini ekrana yazdiriniz.

        String shirt = "2300";
        String shoes = "5200";

        //Java'da + sembolu iki sayi arasinda kullanilirsa "toplama islemi" olur.
        //Java'da + sembolu iki String arasinda veya bir String ve bir sayi kullanilirsa "concatenation (birlestirme)
        // islemi" olur.
        //Note: Concatenation islemlerinde Java matematikteki islem onceligi kurallarini kullanir.
        //Islem onceligi kurallari: I) Once uslu sayilar II)Parantez ici islemler yapilir
        //III) Carpma ve bolme IV) Toplama ve cikarma
        System.out.println(shirt + shoes); //23005200


        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);

        System.out.println(toplamFiyat); //7500

        //Example 6: Size String olarak verilen iki fiyatin toplamini ekrana yazdiriniz.
        //Note: valueOf() methodu tum karakterleri rakam olan stringleri sayilara cevirir.
        //      Eger valueOf() methodu kullanirken String'in icine rakam olmayan bir karakter koyarsaniz hata
        // alirsiniz. Bu hatayi duzeltmeyi ileride ogrenecegiz.

        String tv = "$11000";
        String radio = "$3000";

        System.out.println(tv + radio); //$11000$3000

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
    }
}
