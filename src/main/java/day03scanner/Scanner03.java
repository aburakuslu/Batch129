package day03scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //kullanicidan adresi aliniz ve ekrana yazdiriniz.
        Scanner input = new Scanner(System.in);

        System.out.println("lutfen adresinizi giriniz...");

        //nextLine() cok kelimeli inputlar icin kullanilir.
        String address = input.nextLine();

        System.out.println("Adres: " + address);
    }
}
