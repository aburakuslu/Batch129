package ssg01;

import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {

        /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int row = input.nextInt();

        System.out.println("Please enter the number columns: ");
        int column = input.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int k = 1; k <= column; k++) {
                System.out.print("X ");
            }
            System.out.println();
        }

    }
}
