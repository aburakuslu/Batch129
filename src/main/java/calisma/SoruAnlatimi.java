package calisma;

public class SoruAnlatimi {

    //1) Dairenin alanini hesaplayan methodu olusturunuz ve hesaplayiniz.
    //2) Dairenin cevresini hesaplayan methodu olusturunuz ve hesaplayiniz.

    public static void main(String[] args) {

        int circleAreaResult = circleArea(3);
        System.out.println("Dairenin Alani: " + circleAreaResult);

        int circlePerimeterResult = cirlePerimeter(6);
        System.out.println("Dairenin cevresi: " + circlePerimeterResult);



    }

    public static int circleArea(int a){
        return 3 * a * a;
    }

    static int cirlePerimeter(int a){
        return 2*3* a;
    }

}
