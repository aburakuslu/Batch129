package calisma;

import java.util.Scanner;

public class Codesdope04 {

    public static void main(String[] args) {

        int a = 24;

        for (int i = 1; i <= 10; i++) {
            int sonuc = a * i;
            System.out.println("24 * " + i + " = " + sonuc);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("24 * " + i + "\t=\t" + (24 * i));
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int x = input.nextInt();
        int fact  =  1;
        for(int i = x; i>=1 ;i--){
            fact = fact*i;
        }
        System.out.println("Factorial is "+fact);

    }
}
