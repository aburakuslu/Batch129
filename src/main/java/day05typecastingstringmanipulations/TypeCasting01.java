package day05typecastingstringmanipulations;

public class TypeCasting01 {

    /*
        Numeric primitive data type'larinin birbirine donusturulmesine "Type Casting" denir.
        Numeric(Sayisal) Data Type'lar: byte - short - int - long - float - double


        Note 1: Kucuk data type'larini buyuk data type'larina cevirmeyi Java otomatik olarak yapabilir.
                Bu isleme "AutoWidening" (Otomatik Genisletme) denir.

        Note 2: Buyuk data type'larini kucuk data type'larina cevirmek riskli bir istir. Java, bu riskli isi
                otomatik olarak yapmaz. Bu islemi kod yazanlar yapar.
                Bu isleme "ExplicitNarrowing" (Aciktan daraltma) denir.
     */
    public static void main(String[] args) {

        // byte data type'ini int data type'ina ceviriniz.

        byte age = 13;
        int byteInt = age; //AutoWidening


        //long data type'ini short data type'ina ceviriniz.

        long weight = 234;
        short weightInt = (short)weight; //ExplicitNarrowing

        //int data type'ini float data type'ina ceviriniz.
        int population = 700000;
        System.out.println(population);

        float populationFloat = population;
        System.out.println(populationFloat);

        //double data type'ini short data type'ina ceviriniz.
        double height = 1.87;
        System.out.println(height); //1.87

        short heightShort = (short)height;
        System.out.println(heightShort); //1

        //Dikkat!
        //Donusum yaptiginiz sayi (260), donuseceginiz data type'inin sinirlari disinda ise, Java kullandiginiz
        //  sayi ile "mod" islemi yapar ve mod isleminin sonucu sizin yeni degeriniz olur.

        //Example 1:
        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte)num;
        System.out.println(numByte);//4

        //Example 2:
        short n = 1023;
        System.out.println(n);

        byte nByte = (byte)n;
        System.out.println(nByte);




    }
}
