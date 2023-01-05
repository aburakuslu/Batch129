package ssg05;

import java.util.Arrays;

public class MdExamples01 {

    public static void main(String[] args) {

        //Example 1: Bir integer multidimensional array olusturunuz.
        //           Toplam eleman sayisini console'a yazdiriniz.

        int a[][] = {{4, 2, 5, 6}, {6,3,4,8}, {2,3,9,6}};
        System.out.println(Arrays.deepToString(a));

        int sum = 0;
        for (int[] w: a) {
            sum = sum + w.length;
        }
        System.out.println(sum);
    }
}
