package ssg05;

import java.util.Arrays;

public class MdExamples03 {

    public static void main(String[] args) {

        //Example 1: Bir multi-dimensional array olusturunuz ve bir dimensionalli array'e donusturunuz.
        //           [ [2, 5], [4,7,11] ] ==> [2, 5, 4, 7, 11]

        int a[][] = {{2, 62, 82}, {3, 13}, {}};

        int total = 0;
        for(int[] w : a){
            total = total + w.length;
        }

        int b[] = new int[total];
        int idx = 0;

        for(int[] w : a){
            for(int k : w){
                b[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
