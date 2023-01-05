package ssg01;

import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz: ");
        int row = input.nextInt();

        for (int i = 1; i <= row; i++){
            for(int k = 1; k <= i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 1; i < 6; i++) {
            sum = sum + i;
        }
        System.out.println("Toplam: " + sum);


        System.out.println();


        /*    Socrative'de cikan soru.
                    543
                    54
                    5
              seklini veren for loop'u yaziniz.
        */

        for(int i=1; i<=5; i++) {
            for(int j=(5-i); j>1; j--) {
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
}
