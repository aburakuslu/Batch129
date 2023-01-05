package day02datatypesmethodcreation;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Odevler {

    public static void main(String[] args) {


        int rectangleAreaResult = rectangleArea(5,7);
        System.out.println(rectangleAreaResult);

        int rectanglePerimeterResult = rectanglePerimeter(5,7);
        System.out.println(rectanglePerimeterResult);

        int circleAreaResult = circleArea(6);
        System.out.println(circleAreaResult);

        int circlePerimeterResult = circlePerimeter(5);
        System.out.println(circlePerimeterResult);
    }



    public static int rectangleArea(int a, int b){
        return a * b;
    }

    static int rectanglePerimeter (int a, int b){
        return (a * b) * 2;
    }

    public static int circleArea (int a){
        return a * 3;
    }

    static int circlePerimeter(int a){
        return 2 * 3 * a;
    }

}
