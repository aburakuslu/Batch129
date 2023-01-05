package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
        Java'da method nasil olusturulur?

        1) Main method'un disinda olusturulur.
        2) Access Modifier + Return Type + Method Ismi + ()

        Olusturulan method nasil kullanilir?
        1) main method'un icinden kullanilir
        2) method'un ismini + () yazin
        3) islem yapacaginiz sayilari parantezin icine koyun.
     */

    public static void main(String[] args) {

        int sonuc = add(30,50);
        System.out.println(sonuc);

        long carpmaSonucu = multiply (3, 6);
        System.out.println(carpmaSonucu);

        int ucluSonuc = firstTwoMultiplyThirdAdd(3,4,5);
        System.out.println(ucluSonuc);

        double kup = getCube(5);
        System.out.println(kup);

    }

    public static int add(int a, int b){
        return a + b;
    }

    protected static long multiply(int a, int b){
        return a * b;
    }


    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return (a * b) + c;
    }
        //Note: Access Modifier'i default yapmak icin modifier'i yazmayiniz.

    static double getCube(double a){
        return a*a*a;
    }

    //1) Dikdortgenin alanini hesaplayan methodu olusturunuz ve hesaplayiniz.
    //2) Dikdortgenin cevresini hesaplayan methodu olusturunuz ve hesaplayiniz.
    //3) Dairenin alanini hesaplayan methodu olusturunuz ve hesaplayiniz.
    //4) Dairenin cevresini hesaplayan methodu olusturunuz ve hesaplayiniz.

}
