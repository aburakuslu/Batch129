package day05typecastingstringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Example 1: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Example 2: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);

        //Example 3: "s" String'indeki "earn" kelimesini "win" kelimesine ceviriniz.

        String s2 = s.replace("earn", "win");
        System.out.println(s2); //Lwin Java win money

        //Example 4: "s" String'indeki "a" harflerini "*" kelimesine ceviriniz.
        //Note: Replace method'unda coklu karakter ile calisirsaniz mecbur cift tirnak kullanilmalidir.
        // Ancak tek karakterle calisirsaniz, cift tirnak veya tek tirnak kullanilabilir.

        String s3 = s.replace("a", "*");
        System.out.println(s3); //Le*rn J*v* e*rn money

        //Example 5: "s" String'indeki "n" harflerini "XXX" kelimesine ceviriniz.
        //Note: Ama ya ikisi de cift tirnak veya tek tirnak olmalidir.

        String s4 = s.replace("n", "XXX");
        System.out.println(s4); //LearXXX Java earXXX moXXXey


        //Example 6: "s" String'indeki butun "e" harflerini siliniz.
        //Note: "Hicbir sey" char data type'inda yoktur, bu yuzden replace() method'u kullanarak silme islemi
        //yapilirsa mutlaka cift tirnak kullanilmalidir.

        String s5 = s.replace("e", "");
        System.out.println(s5); //Larn Java arn mony


        String t = "Ali 13 yasindadir!...";

        //Example 7: "t" String'indeki tum rakamlari (0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*"'a ceviriniz.
        //Note: Bir grup data'yi degistirmek icin replaceAll() kullanilmalidir.
        //Note: Bir grup data'yi ifade etmek "Regular Expressions" kullanilir.
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);

        /*
            Meshur Regex
            1) Tum rakamlar ==> [0-9]
            2) Tum kucuk harfler ==> [a-z]
            3) Tum buyuk harfler ==> [A-Z]
            4) Tum kucuk ve buyuk harfler ==> [a-zA-Z]
            5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
            6) Tum noktalama isaretleri ==> \\p{punct} (Ezberle)
            7) Tum sesli harfler ==> [aeiouAEIOU]
               x, q, w harfleri ==> [xqw]

            8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
            9) Tum harflerden farkli character'ler ==> [^a-zA-Z]

            10) Space disindaki tum character'ler ==> \\S
         */


        //Example 8: "t" String'indeki tum harfleri ve rakamlari "!"'e ceviriniz.

        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2); //!!! !! !!!!!!!!!!!...


        //Example 9: "t" String'indeki tum harfleri ve rakamlari "!"'e ceviriniz.
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3); //?l? 13 y?s?nd?d?r!...

        //Example 10: "t" String'indeki kucuk harfler disindaki tum character'leri "<>" ceviriniz.

        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4); //<>li<><><><>yasindadir<><><><>

        //Example 11: "t" String'indeki tum harfler disindaki tum character'leri "+" ceviriniz.

        String t5 = t.replaceAll("[a-zA-Z]", "+");
        System.out.println(t5); //+++ 13 ++++++++++!...


        //Example 12: "t" String'indeki space'ler disindaki tum character'leri "+" ceviriniz.

        String t6 = t.replaceAll("[^ ]","+");
        System.out.println(t6); //+++ ++ ++++++++++++++

        //Example 13: "t" String'indeki sesli harfler disindaki tum character'leri "&" ceviriniz.

        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7); //A&i&&&&&a&i&&a&i&&&&&



















    }
}
