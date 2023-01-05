package day03scanner;

import java.util.Scanner;

public class Scanner04Tekrar {

    public static void main(String[] args) {

        //Kullanicidan 2 sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        System.out.println("Toplama: " + (firstNumber + secondNumber));
        System.out.println("Cikarma: " + (firstNumber - secondNumber));
        System.out.println("Carpma: " + (firstNumber * secondNumber));
        System.out.println("Bolme: " + (firstNumber / secondNumber));

    }
}
