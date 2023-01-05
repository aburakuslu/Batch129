package day16multidimensionalarrays;

import java.util.Arrays;

public class Md04 {

    public static void main(String[] args) {

        //Example 1: Bir multi-dimensional array olusturunuz ve bir dimensionalli array'e donusturunuz.
        //           [ [2, 5], [4,7,11] ] ==> [2, 5, 4, 7, 11]

        int a[][] = {{2, 5}, {4, 7, 11}};

        //a Array'indeki toplam eleman sayisini bulunuz.

        int totalElement = 0;
        for(int[] w : a){
            totalElement = totalElement + w.length;   // a[] toplam eleman sayisi
        }

        // "b" isimli tek dimension'li bir array olusturunuz.

        int b[] = new int[totalElement];

        //"a" array'indeki elemanlari "b" array'ine transfer ediniz.

        int idx = 0;

        for (int[] w : a){
            for(int k : w){
                b[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
