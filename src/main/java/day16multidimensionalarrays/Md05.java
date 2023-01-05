package day16multidimensionalarrays;

public class Md05 {

    public static void main(String[] args) {

        //Example 1: bir integer multi-dimensional array olusturunuz.
        //           bu array'deki tum elemanlarin carpimini yazdiran kodu yazdiriniz.

        int a[][] = {{2, 5}, {4, 7, 11}};

        int multiply = 1;

        for(int[] w : a ){
            for(int k : w){
                multiply = multiply * k;
            }
        }
        System.out.println(multiply); //3080
    }
}
