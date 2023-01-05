package ssg_nestedloop;

public class NestedLoop03 {

    public static void main(String[] args) {
       /*
        Soru 2 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin

         *
         * *
         * * *
         * * * *
         * * * * *

        */

        //           nested for loop ya diktorgen veya ucgen formatinda olabilir
        //           diktorgen istedigimizde iki loop icin de bagimsiz end point belirleriz
        //           ucgen sekli vermek icin inner loop'un end point'ini olarak outer degiskene bagli yapariz

        int input = 5;
        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("------------------------");

        /*Soru 3) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        1
        22
        333
        4444
        55555
        */

        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

    }
}
