package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {

    /*
        1) Method overloading yaparken method ismi degistirilmez.
        2) Method overloading yaparken parametreler degistirilir.
            i) Parametre degistirirken, parametrelerin data type'lari degistirilebilir.
           ii) Parametre degistirirken, parametrelerin data type'lari farkli ise yerleri degistirilebilir.
          iii) Parametre degistirirken, parametrelerin sayisi degistirilebilir.
        3) Java icin "ismi" ve "parametreleri" ayni olan iki method tamamen aynidir.
           Bu yuzden "ismi" ve "parametre" "Method Signature" olarak adlandirilir.
        4) Method Overloading olustururken return type'i degistirmenin hicbir etkisi yoktur.
           Method Overloading olustururken access modifier'i degistirmenin hicbir etkisi yoktur.
           Method Overloading olustururken method'u static veya non-static yapmanin hicbir etkisi yoktur.
           Method Overloading olustururken method body'i degistirmenin hicbir etkisi yoktur.
        5) "private" method'lar overload edilebilir. Cunku overloading sadece bir class'in icinde olur.
           "private" olmak ise class'lara gidildiginde problem olusturur.
        6) "static" methodlar overload edilebilirler.

     */

    public static void main(String[] args) {
        add(3, 5);

    }

    private static void add(int a, int b) {
        System.out.println(a + b);
    }

    private static void add(double a, double b) {
        System.out.println(a + b);
    }

    private static void add(double a, int b) {
        System.out.println(a + b);
    }

    private static void add(int a, double b) {
        System.out.println(a + b);
    }

    private static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

}
