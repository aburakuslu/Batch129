package exercise;

import java.util.Arrays;

public class Codesdope05_Arrays03 {

    public static void main(String[] args) {

        //If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60],
        // your program should be able to find that the subarray lies
        // between the indexes 3 and 8.

        int arr[] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};

        int brr[] = new int[5];
        int j = 0;
        for (int i = 3; i < 8; i++) {
            System.out.println(arr[i]);
            brr[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(brr));



    }
}
