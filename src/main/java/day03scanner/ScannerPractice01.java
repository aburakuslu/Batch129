package day03scanner;

import java.util.Scanner;

public class ScannerPractice01 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir sayi giriniz: ");
        int number1 = input.nextInt();

        int birler = number1 % 10;
        number1 = number1 / 10;
        System.out.println("Sayinin birler basamagi: " + birler);

        int onlar = number1 % 10;
        number1 = number1 / 10;
        System.out.println("Sayinin onlar basamagi: " + onlar);

        int yuzler = number1 % 10;
        number1 = number1 / 10;
        System.out.println("Sayinin yuzler basamagi: " + yuzler);


        /*
         Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
           Ex :
           input  : 12345
           output : 12
         */

        System.out.println("Lutfen 5 basamakli bir sayi giriniz: ");

        int number2 = input.nextInt();

        int lastDigit = number2%10;
        number2 = number2/10;

        int lastSecondDigit = number2%10;
        number2 = number2/10;

        int lastThirdDigit = number2%10;
        number2 = number2/10;

        int secondDigit = number2%10;
        number2 = number2/10;

        int firstDigit = number2%10;

        System.out.println(lastDigit + lastSecondDigit + secondDigit + firstDigit);








    }
}
