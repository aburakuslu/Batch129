package ssg_nestedloop;

public class NestedLoop04 {

    public static void main(String[] args) {

        // soru 6 Asagidaki sekil cizen kodu yaziniz
        
        /*
                *
                * *
                * * *
                * * * *
                * * * * *

                * * * * *
                * * * * *
                * * * * *
                * * * * *

                * * * * *
                * * * *
                * * *
                * *
                *

         */

        for (int i =1; i<=5 ; i++) {
            for (int j =1; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i =1; i<=5 ; i++) {
            for (int j =1; j<=5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        for (int i =1; i<=5 ; i++) {
            for (int j =5; j>=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
