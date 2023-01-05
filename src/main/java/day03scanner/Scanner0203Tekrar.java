package day03scanner;

import java.util.Scanner;

public class Scanner0203Tekrar {

    public static void main(String[] args) {

        //Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen ilk isminizi giriniz:");
        String firstName = input.next();
        System.out.println("Lutfen soyisminizi giriniz:");
        String lastName = input.next();

        System.out.println("Isim Soyisim: " + firstName + " " + lastName);




        System.out.println("Lutfen adresinizi giriniz: ");
        String address = input.nextLine();

        System.out.println("Lutfen il giriniz: ");
        String city = input.next();

        System.out.println("Adres: " + address);
        System.out.println("Il: " + city);





    }
}
