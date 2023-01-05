package ssg06;

public class MethodsPractice {

    public static void main(String[] args) {

        MethodsPractice.Git();
        int result = multiply(3,4,5,6);
        System.out.println(result);

        int recAreaResult = rectangleArea(5,7);
        System.out.println(recAreaResult);

        Gel();

    }


    public static void Git(){
        System.out.println("Hizli git.");
    }

    static int multiply(int a, int b, int c, int d){
        return a*b*c*d;
    }

    public static int rectangleArea(int e, int f){
        return 2*e*f;
    }

    public static void Gel(){
        System.out.println("Cabuk geri gel.");
    }
}

