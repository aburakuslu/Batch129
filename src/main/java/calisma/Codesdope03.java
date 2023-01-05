package calisma;

import java.util.Scanner;

public class Codesdope03 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a number");
            sum = sum + s.nextInt();
        }
        System.out.println("Sum is " + sum);

         /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
         */

        System.out.println("Lutfen satir sayisini giriniz: ");
        int row = s.nextInt(); //3
        System.out.println("Lutfen sutun sayisini giriniz: ");
        int column = s.nextInt(); //5

        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= column; k++) {
                System.out.print("X ");
            }
            System.out.println(); //X X X X X
                                  //X X X X X
                                  //X X X X X
        }
    }
}


