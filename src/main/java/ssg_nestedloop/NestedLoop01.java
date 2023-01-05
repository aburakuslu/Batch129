package ssg_nestedloop;

public class NestedLoop01 {

    public static void main(String[] args) {
        /*
            ? ? ? ? ?
            ? ? ? ? ?
            ? ? ? ? ?
            ? ? ? ? ?
            ? ? ? ? ?
        */

        for (int i = 1; i <= 5; i++) { //outer loop
            System.out.print("?" + " ");

            for (int j = 1; j <= 4; j++) { //inner loop
                System.out.print("?" + " ");
            }
            System.out.println();
        }

    }
}
