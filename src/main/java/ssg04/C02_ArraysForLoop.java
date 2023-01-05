package ssg04;

import java.util.Arrays;

public class C02_ArraysForLoop {

    public static void main(String[] args) {

        int numbers[] = new int[6];
        numbers[0] = 34;
        numbers[1] = 12;
        numbers[2] = 45;
        numbers[3] = 42;
        numbers[4] = 14;
        numbers[5] = 26;

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);

        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int w : numbers) {
            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);
        }

        System.out.println(minimum + maximum);
    }
}
