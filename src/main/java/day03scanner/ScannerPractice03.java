package day03scanner;

import java.util.Scanner;

public class ScannerPractice03 {

    public static void main(String[] args) {

        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        // formula:
        // c = (f-32)*5/9

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the temperature: ");
        int temperatureInF = input.nextInt();

        int celsius = (temperatureInF - 32) * 5 / 9;

        System.out.println("The weather is " + celsius + " degrees Celsius.");

    }
}
