package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println("getSumOfAllElements(myList) = " + getSumOfAllElements(myList));
        System.out.println("getSumFromSevenToSeventy() = " + getSumFromSevenToSeventy());
        System.out.println("getProductFromThreeToNine1() = " + getProductFromThreeToNine1());
        System.out.println("getProductFromThreeToNine2() = " + getProductFromThreeToNine2());
        System.out.println("getFactorial(5) = " + getFactorial(5));
        System.out.println("getSumOfEvensBetweenTwoInt(15, 4) = " + getSumOfEvensBetweenTwoInt(15, 4));
        System.out.println(getSumOfDigitsBetweenTwoInts(120, 98));
    }

    //1)Verilen List'teki tum sayilarin toplamini veren method'u olusturunuz
    public static int getSumOfAllElements(List<Integer> myList) {
        return myList.
                stream().
                reduce(Math::addExact).
                get();
    }


    //2)7'den 70'e kadar tum tam sayilarin toplamini veren kodu yaziniz.
    public static int getSumFromSevenToSeventy() {

        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();
    }

    //3)3'ten 9'a kadar tum tam sayilarin carpimini veren method'unu olusturunuz.
    public static int getProductFromThreeToNine1() {
        return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();
        //1. ve 2. dahil
    }

    public static int getProductFromThreeToNine2() {
        return IntStream.range(3, 10).reduce(Math::multiplyExact).getAsInt();
        //1. dahil, 2. haric
    }

    //4)Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
    public static int getFactorial(int x) {

        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        } else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }

    }

    //5)Size verilen iki tam sayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    public static int getSumOfEvensBetweenTwoInt(int a, int b) {

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return IntStream.range(a + 1, b).filter(Utils::isNumberEven).sum();
    }

    //6)Size verilen iki tam sayi arasindaki tum tam sayilarin rakamlari toplamini veren kodu yaziniz.
    //  12 ile 18 ==> 13 14 15 16 17 ==> 4 + 5 + 6 + 7 = 30
    public static int getSumOfDigitsBetweenTwoInts(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return IntStream.range(a + 1, b).map(Utils::getSumOfDigits).sum();
    }


}
