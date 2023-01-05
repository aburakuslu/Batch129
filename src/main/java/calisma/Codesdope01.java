package calisma;

import java.util.Scanner;

public class Codesdope01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first integer number: ");
        int firstInt = scan.nextInt();

        System.out.println("Please enter the second integer number: ");
        int secondInt = scan.nextInt();

        int sumofInts = firstInt + secondInt;
        System.out.println("The total number is: " + firstInt + " + " + secondInt +
                " = " + sumofInts);


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int sumOfTwo = a + b;
        int productOfTwo = a * b;

        System.out.println("The sum: "+  sumOfTwo + "\nThe product: " + productOfTwo);
    }
}
