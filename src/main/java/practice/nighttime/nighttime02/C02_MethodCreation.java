package practice.nighttime.nighttime02;

public class C02_MethodCreation {

    public static void main(String[] args) {

        //Dikdortgenin alanini hesaplayan kodu yaziniz ve kullaniniz.
        System.out.println("Dikdortgenin alani: " + dikdortgenAlani(10, 5));

        System.out.println("Dikdortgenin Cevresi: " + dikdortgeninCevresi(12, 45));

        kareninAlani(25);

    }

    public static int dikdortgenAlani(int a, int b) {
        return a * b;
    }

    public static int dikdortgeninCevresi(int a, int b){
        return 2*(a+b);
    }

    //Karenin alanini hesaplatan kodu yaziniz.

    public static void kareninAlani(int a){
        System.out.println("Karenin Alani: " + (a*a));
    }




}
